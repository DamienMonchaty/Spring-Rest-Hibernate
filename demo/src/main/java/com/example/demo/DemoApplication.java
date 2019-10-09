package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.demo.dao.ContactRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.EmployeeProfileRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeProfile;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeProfileRepository employeeProfileRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run (String... arg0) throws Exception {
//		
//		employeeRepository.save( new Employee("Rajeev", "Singh", "rajeev@callicuder.fr",
//                "MY_SUPER_SECRET_PASSWORD"));
//
//
//        
//		employeeProfileRepository.save(new EmployeeProfile("+91-8197882053", 
//                "747", "2nd Cross", "Golf View Road, Kodihalli", "Bangalore",
//                "Karnataka", "India", "560008"));
////	
		

	}
}
