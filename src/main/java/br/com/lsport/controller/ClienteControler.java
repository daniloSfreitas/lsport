package br.com.lsport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsport.model.Cliente;
import br.com.lsport.service.ClienteServiceImpl;

@Controller
public class ClienteControler {
	
	@Autowired
	public ClienteServiceImpl clienteServiceImpl;

	@GetMapping("/")
	public String getAll(Model model) {

		model.addAttribute("cliente", clienteServiceImpl.getAll());
		return "index";
	}

	@GetMapping("/cadastro")
	public String showSignUpForm(Cliente cliente) {
		return "cadastro";
	}

	@PostMapping("/cadastro")
	public String cadastrar(@valid Cliente cliente, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("error", result.getAllErrors());
			return "index";
		}
		Cliente c = clienteServiceImpl.cadastrar(cliente);
		model.addAttribute("cliente", clienteServiceImpl.getAll());
		return "index";
	}
	
	
	
	
}


