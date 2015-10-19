package br.com.curso.questionario.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.curso.questionario.contact.controller.json.ContactConverter;
import br.com.curso.questionario.contact.controller.json.ContactJson;
import br.com.curso.questionario.contact.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private ContactConverter contactConverter;
	
    @RequestMapping("/contacts")
    public String list(Model model) {
    	model.addAttribute("contacts", contactConverter.toJson(contactService.list()));
    	return "contacts";
    }
}
