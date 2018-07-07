package com.algaworks.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.dao.ProdutoDao;
import com.algaworks.dao.VendaDao;
import com.algaworks.model.Venda;

@Service
public class VendaService {

	@Autowired
	private VendaDao vendaDao;

	@Autowired
	private ProdutoDao produtoDao;

	public Venda adicionar(Venda venda) {
		venda.setCadastro(LocalDate.now());
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtoDao.findById(i.getProduto().getId()).get());
		});

		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		venda.setTotal(totalItens.add(venda.getFrete()));

		return vendaDao.save(venda);

	}
}
