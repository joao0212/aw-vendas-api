package com.algaworks.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long>{

}
