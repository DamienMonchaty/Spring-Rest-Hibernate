package com.example.demo.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.example.demo.entities.Contact;

public class ContactUtils {
	
	private static List<Contact> contacts = new ArrayList<Contact>();
	
	private static final int NUM_CONTACTS = 30;
	
	public static List<Contact> buildContacts(){
		if (contacts.isEmpty()) {
			IntStream.range(0, NUM_CONTACTS).forEach(n ->{
				contacts.add(new Contact());
			});
		}
		return contacts;
	}

}
