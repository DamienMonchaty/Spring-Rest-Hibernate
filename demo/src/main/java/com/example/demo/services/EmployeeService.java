package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactRepository;
import com.example.demo.dao.EmployeeProfileRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entities.Cheese;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeProfile;

@Service
@Transactional
public class EmployeeService {
	
	private final EmployeeProfileRepository employeeProfileRepository;
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository, EmployeeProfileRepository employeeProfileRepository) {

		this.employeeRepository=employeeRepository;
		this.employeeProfileRepository=employeeProfileRepository;
	}
	public List<Employee>showAllEmployee(){
			
		List<Employee> employees=new ArrayList<>();
		

		
		employeeRepository.saveAll(employees);		
		
		
		
		
		for(Employee employee: employeeRepository.findAll()) {
			employees.add(employee);

		}
		

		
		return employees;
		
		
	}
	public void saveMyEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		

		}

}
