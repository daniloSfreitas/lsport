package br.com.lsport.service;

import java.util.List;

import br.com.lsport.model.Cliente;

public interface UsuarioService {

	public List<Cliente> getAll();
	
	public String cadastrar(Cliente nome);
}
