package com.algaworks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.dao.ClienteDao;
import com.algaworks.model.Cliente;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteDao clienteDao;

	@GetMapping
	public java.util.List<Cliente> listar() {
		return clienteDao.findAll();
	}

}
