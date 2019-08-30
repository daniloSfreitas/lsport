package br.com.lsport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsport.model.Cliente;
import br.com.lsport.service.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteControler {
	
	@Autowired
	public ClienteServiceImpl clienteServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> getAll(){
		
		List<Cliente> cliente = clienteServiceImpl.getAll();
		
	return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);
			
	}

	@RequestMapping (method = RequestMethod.POST)
	public String cadastrar(@valid Cliente cliente) {
		if(result.hasErros()) {
		
		return "Error";
				
	}
		clienteServiceImpl.cadastrar(cliente);
		model.addAtrtibute("cliente", clienteServiceImpl.cadastrar());
		return "index";
	}
	
	
	
	
}


