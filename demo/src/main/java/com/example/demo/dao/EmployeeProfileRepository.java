package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.EmployeeProfile;

@Transactional
@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile,Long> 
{
	
}
