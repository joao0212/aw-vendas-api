package com.algaworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.dao.ProdutoDao;
import com.algaworks.model.Produto;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoDao produtoDao;

	@GetMapping
	public List<Produto> listar() {
		return produtoDao.findAll();
	}

}
