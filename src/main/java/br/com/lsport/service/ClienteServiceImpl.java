package br.com.lsport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.lsport.dao.ClienteDaoImpl;
import br.com.lsport.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	public ClienteDaoImpl clientedaoImpl;
	
	@Override
	public List<Cliente> getAll() {
		List<Cliente> clientes = clientedaoImpl.getAll();
		return clientes;
	}

	@Override
	public String cadastrar(Cliente cliente) {
		clientedaoImpl.cadastrar(cliente);
		return "Cadastrado";
	}

}
