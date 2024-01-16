package com.artemoleshev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
	@GetMapping("/")
	public String showFirstView() {
		return "first-view";
	}

	@GetMapping("/askDetails")
	public String askEmployeeDetails(Model model) {
//		Employee emp = new Employee();
		
//		emp.setName("Artem");
//		emp.setSalary(123);
//		emp.setSurname("Oleshev");
		model.addAttribute("employee", new Employee());
		
		return "ask-emp-details-view";
	}

	@PostMapping("/showDetails")
	public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, 
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "ask-emp-details-view";
		}
		    
		else {
			return "show-emp-details-view";
		}
		
	}
}
