package br.com.lsport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lsport.model.User;

@Controller
public class HelloControler {

    @GetMapping("/pedido")
    public ModelAndView showSignUpForm() {
        User user = new User();
        user.setName("Danilo");
        ModelAndView m = new ModelAndView("index");
        m.addObject(user);
        return m;
    }

}
