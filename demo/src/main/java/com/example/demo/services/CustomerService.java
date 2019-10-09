package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.User;



@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	
	public List<Customer>showAllCustomers(){
		
		List<Customer> customers=new ArrayList<Customer>();
		
		for(Customer customer: customerRepository.findAll()) {
			customers.add(customer);
			
		}
		
		return customers;
		
		
	}

}
