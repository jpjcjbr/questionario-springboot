package br.com.curso.questionario.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import br.com.curso.questionario.contact.model.Contact;
import br.com.curso.questionario.contact.model.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public List<Contact> list() {
		return Lists.newArrayList(contactRepository.findAll());
	}
}
