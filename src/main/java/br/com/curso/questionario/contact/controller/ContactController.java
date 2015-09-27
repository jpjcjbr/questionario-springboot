package br.com.curso.questionario.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.questionario.contact.controller.json.ContactConverter;
import br.com.curso.questionario.contact.controller.json.ContactJson;
import br.com.curso.questionario.contact.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private ContactConverter contactConverter;
	
    @RequestMapping("/contacts")
    public List<ContactJson> list() {
    	return contactConverter.toJson(contactService.list());
    }
}
