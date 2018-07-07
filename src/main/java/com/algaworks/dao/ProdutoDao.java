package com.algaworks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.model.Produto;

public interface ProdutoDao extends JpaRepository<Produto, Long>{

}
