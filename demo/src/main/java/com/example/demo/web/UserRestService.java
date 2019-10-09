package com.example.demo.web;
import com.example.demo.dao.*;
import com.example.demo.entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserRestService {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();		
	}

	@RequestMapping(value="/chercherUsers",method=RequestMethod.GET)
	public Page<User> chercher(
						  @RequestParam(name="mc", defaultValue="") String mc, 
			              @RequestParam(name="page", defaultValue="0") int page, 
			              @RequestParam(name="size", defaultValue="5") int size){
	Page<User> p = userRepository.chercher(mc, new PageRequest(page, size));
	return p;
	}
	
}
