package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeProfileRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeProfile;

@Service
@Transactional
public class EmployeeProfileService {

private final EmployeeProfileRepository employeeProfileRepository;
	

	
	public EmployeeProfileService(EmployeeProfileRepository employeeProfileRepository) {
		this.employeeProfileRepository=employeeProfileRepository;

	}
	public List<EmployeeProfile>showAllEmployeeProfile(){
			
		List<EmployeeProfile> employeeProfiles=new ArrayList<>();		
		
		
		
		
		for(EmployeeProfile employeeProfile: employeeProfileRepository.findAll()) {
			employeeProfiles.add(employeeProfile);

		}
		

		
		return employeeProfiles;
		
		
	}
public void saveMyEmployeeProfile(EmployeeProfile employeeProfile) {
		
		employeeProfileRepository.save(employeeProfile);
		

		}

}
