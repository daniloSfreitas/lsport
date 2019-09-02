package br.com.lsport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsport.model.Cliente;
import br.com.lsport.service.ClienteServiceImpl;

@RestController
@RequestMapping("cliente")
public class ClienteControler {
	
	@Autowired
	public ClienteServiceImpl clienteServiceImpl;
	
	 @GetMapping("*")
	    public String showSignUpForm(List<Cliente> clientes) {
	        return "cliente";
	    }

	@PostMapping("/cadastro")
	public String cadastrar(@valid Cliente cliente, BindingResult result, Model model) {
		if (result.hasErrors()) {
		
		return "Error";
				
	}
		clienteServiceImpl.cadastrar(cliente);
		model.addAttribute("cliente", clienteServiceImpl.cadastrar(cliente));
		return "index";
	}
	
	
	
	
}


