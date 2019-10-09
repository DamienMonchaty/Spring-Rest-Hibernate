package com.example.demo.web;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.CategoryRepository;
import com.example.demo.dao.CheeseRepository;
import com.example.demo.dao.ContactRepository;
import com.example.demo.entities.Category;
import com.example.demo.entities.Cheese;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeProfile;
import com.example.demo.entities.User;
import com.example.demo.services.CheeseService;
import com.example.demo.services.ContactService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.EmployeeProfileService;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.UserService;

@Controller
public class MainController {
	
	@Autowired
	CheeseRepository cheeseDao;
	
	@Autowired
	CategoryRepository categoryDao;
	
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CheeseService cheeseService;
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeProfileService employeeProfileService;
	
	@RequestMapping(value = {"/index" }, method = RequestMethod.GET)
	public String index(HttpServletRequest request) {
		
	return "index";
	}
	@RequestMapping(value = { "/register" })
	public String register(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");

	return "register";
	}
	@PostMapping(value = { "/save-user" })
	public String registerUser(@ModelAttribute User user, BindingResult bindingresult,HttpServletRequest request  ) {		
		
		userService.saveMyUser(user);	
		
	return "login";
	}
	@PostMapping(value = { "/save-cheese" })
	public String registerCheese(@ModelAttribute Cheese cheese,@ModelAttribute Category category, Model model, BindingResult bindingresult,HttpServletRequest request  ) {		
		
		cheeseService.saveMyCheese(cheese);	
		
	return index2(model);
	}
	@PostMapping(value = { "/save-employee" })
	public String registerEmployee(@ModelAttribute Employee employee,@ModelAttribute EmployeeProfile employeeProfile, Model model, BindingResult bindingresult,HttpServletRequest request  ) {		
		
		employeeService.saveMyEmployee(employee);
		employeeProfileService.saveMyEmployeeProfile(employeeProfile);
		List<Employee> employees = employeeService.showAllEmployee();
		List<EmployeeProfile> employeeProfiles = employeeProfileService.showAllEmployeeProfile();
		model.addAttribute("employeeProfiles", employeeProfiles);
		model.addAttribute("employees", employees);
		
	return "ListEmployee";
	}
	@GetMapping("/show-users")
	public String showAllUsers(HttpServletRequest request,Model model ) {
		List<User> users = userService.showAllUsers();
		model.addAttribute("users", users);
	return "welcome";
	}
	@RequestMapping(value = { "/delete-user" })
	public String deleteUser(@RequestParam int id,HttpServletRequest request,Model model) {
		
		userService.deleteMyUser(id);
		List<User> users = userService.showAllUsers();
		model.addAttribute("users", users);
		return "welcome";		
	}
	@RequestMapping(value = { "/edit-user" })
	public String editUser(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("user",userService.editUser(id));
		request.setAttribute("mode", "MODE_UPDATE");

		return "register";	
	}
	@RequestMapping(value = { "/","/login" })
	public String login(HttpServletRequest request) {

		return "login";	
	}
	@RequestMapping(value = { "/login-user" })
	public String loginUser(@ModelAttribute User user,HttpServletRequest request, HttpSession session) {
		if(userService.findByEmailAndMotdepasse(user.getEmail(), user.getMotdepasse())!=null) {
			session.setAttribute("user", user);
			
			return "index";
		}
		else {
			request.setAttribute("error","Invalid email & password" );
			return "login";
		}	
	}
	@RequestMapping(value = {"/logout"})
	public String logout(HttpSession session, @ModelAttribute User user) {
		session.removeAttribute("user");
		return "login";
	}
	@GetMapping("/show-contacts")
	public String showAllContacts(HttpServletRequest request,Model model ) {
		List<Contact> contacts = contactService.showAllContacts();
		model.addAttribute("contacts", contacts);

	return "listContact";
	}
	
	@GetMapping("/show-employee")
	public String showAllEmployeeContact(HttpServletRequest request,Model model ) {
		List<Employee> employees = employeeService.showAllEmployee();
		List<EmployeeProfile> employeeProfiles = employeeProfileService.showAllEmployeeProfile();
		model.addAttribute("employeeProfiles", employeeProfiles);
		model.addAttribute("employees", employees);
	return "ListEmployee";
	}
	@GetMapping("/show-customer")
	public String showAllCustomers(HttpServletRequest request,Model model ) {
		List<Customer> customers = customerService.showAllCustomers();

		model.addAttribute("customers", customers);
	return "ListCustomer";
	}
	

	
	@RequestMapping(value="cheesecategorylist")
	public String index2(Model model) {
		List<Category> categories = Lists.newArrayList(categoryDao.findAll());
		model.addAttribute("cheeses", cheeseDao.findAll());
		model.addAttribute("title", "My cheeses");
		model.addAttribute("categories", categories);
		return "cheesecategorylist";
	}
	
//	@RequestMapping(value="add", method=RequestMethod.GET)
//	public String displayAddCheeseForm(Model model) {
//		List<Category> categories = Lists.newArrayList(categoryDao.findAll());
//		
//		model.addAttribute("title", "Add cheese");
//		//model.addAttribute(new Cheese());
//		model.addAttribute("categories", categories);
//		return "add";
//	}
//	
//	@RequestMapping(value="add", method = RequestMethod.POST)
//	public String processAddCheeseForm(@ModelAttribute @Valid Cheese newCheese, Errors errors, @RequestParam int categoryId, Model model ) {
//		
//		if(errors.hasErrors()) {
//			model.addAttribute("title", "Add cheese");
//			model.addAttribute("Categories", categoryDao.findAll());
//			return "add";
//		}
//		Category cat = categoryDao.findById(categoryId).get();	
//		newCheese.setCategory(cat);
//		cheeseDao.save(newCheese);		
//		return "redirect:";
//	}
//	@RequestMapping(value="remove", method = RequestMethod.GET)
//	public String displayRemoveCheeseForm(Model model) {
//		
//		model.addAttribute("cheeses", cheeseDao.findAll());
//		model.addAttribute("title", "Remove Cheese");
//		return "remove";
//	}
//	@RequestMapping(value="remove", method = RequestMethod.POST)
//	public String processRemoveCheeseForm(@RequestParam int[] ids) {
//		
//		for(int id :ids) {
//			cheeseDao.deleteById(id);
//		}
//		return "redirect:";
//	}
	
}
