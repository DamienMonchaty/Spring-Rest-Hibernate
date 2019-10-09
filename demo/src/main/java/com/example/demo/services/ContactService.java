package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactRepository;
import com.example.demo.entities.Contact;
import com.example.demo.entities.User;
import com.example.demo.utils.ContactUtils;

@Service
@Transactional
public class ContactService {
	
	private final ContactRepository contactRepository;
	
	//private final List<Contact> contacts = ContactUtils.buildContacts();
	
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository=contactRepository;
	}
	public List<Contact>showAllContacts(){
			
		List<Contact> contacts=new ArrayList<Contact>();
		
		for(Contact contact: contactRepository.findAll()) {
			contacts.add(contact);
		}
		
		return contacts;
		
		
	}


}
