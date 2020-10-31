package br.edu.usj.edu.lpii.hellonameemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
  
    @PostMapping(value="helloName")
    public ModelAndView postHelloName(@RequestParam String nomeInput, String emailInput ) {
        ModelAndView modelAndView = new ModelAndView("hello-name");
        
        String texto = "Seja bem-vindo " + nomeInput + " e e-mail " + emailInput + ".";
        modelAndView.addObject("mensagem", texto);

        return modelAndView;
    }
    
 
}
