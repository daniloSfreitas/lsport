package br.com.lsport.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import br.com.lsport.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteDaoImpl implements ClienteDao {
	
	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public List<Cliente> getAll() {
		List<Cliente> clientes = null;
		 try {
			 
			 clientes = mongoTemplate.findAll(Cliente.class, "Cliente");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return clientes;
	}

	@Override
	public Cliente cadastrar(Cliente nome) {
		
		try {
			
			mongoTemplate.insert("");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nome;
	}

}
