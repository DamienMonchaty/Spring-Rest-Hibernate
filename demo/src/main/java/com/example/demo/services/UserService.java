package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user) {
		
		userRepository.save(user);
	}
	public List<User>showAllUsers(){
		
		List<User> users=new ArrayList<User>();
		
		for(User user: userRepository.findAll()) {
			users.add(user);
			System.out.println(user.getEmail());
		}
		
		return users;
		
		
	}
	public void deleteMyUser(int id) {
		
		userRepository.deleteById(id);
		
	}
	public User editUser(int id) {
		
		return userRepository.findById(id);
		
	}

	public User findByEmailAndPassword(String email, String motdepasse) {
	
		return userRepository.findByEmailAndMotdepasse(email,motdepasse);
	}

	public User findUserByEmail(String email) {
		return null;
	}

	public Object findByEmailAndMotdepasse(String email, String motdepasse) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailAndMotdepasse(email,motdepasse);
	}
	
    
}
