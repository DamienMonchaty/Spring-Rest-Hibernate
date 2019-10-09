package com.example.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Contact;
import com.example.demo.entities.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer> {
	
	
	public User findByEmailAndMotdepasse(String email, String motdepasse);
	
	public User findByEmail(String email);
	
	public User findById(int id);
	
	@Query("select u from User u where u.nom like %:x%" )
	public Page<User> chercher(@Param("x")String mc, Pageable pageable);


	


}
