package br.com.curso.questionario.contact.controller.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.curso.questionario.contact.model.Contact;

@Component
public class ContactConverter {
	
 	public ContactJson toJson(Contact contact) {
 		return new ContactJson(contact.getNome(), contact.getEmail());
 	}

	public List<ContactJson> toJson(List<Contact> list) {
		List<ContactJson> contacts = new ArrayList<ContactJson>();
		
		for(Contact contact: list) {
			contacts.add(toJson(contact));
		}
		
		return contacts;
	}
}
