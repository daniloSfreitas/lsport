package br.com.lsport.service;

import java.util.List;

import br.com.lsport.model.Cliente;

public interface ClienteService {

	public List<Cliente> getAll();
	
	public String cadastrar(Cliente nome);
}
