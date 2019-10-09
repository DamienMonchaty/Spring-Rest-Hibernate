package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoryRepository;
import com.example.demo.dao.CheeseRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.entities.Category;
import com.example.demo.entities.Cheese;
import com.example.demo.entities.User;

@Service
@Transactional
public class CheeseService {
	
	@Autowired
	private CheeseRepository cheeseRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	public CheeseService(CheeseRepository cheeseRepository,CategoryRepository categoryRepository) {
		this.cheeseRepository=cheeseRepository;
		this.categoryRepository=categoryRepository;

	}
	public void saveMyCheese(Cheese cheese) {
			
		cheeseRepository.save(cheese);
		

		}
}
