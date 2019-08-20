package br.com.lsport.dao;

import java.util.List;

import br.com.lsport.model.Cliente;

public interface ClienteDao {
	
	public List<Cliente> getAll();
	
	public Cliente cadastrar(Cliente nome);
	
	

}
