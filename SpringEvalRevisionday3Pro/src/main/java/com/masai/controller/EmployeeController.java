package com.masai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.beans.Employee;

@RestController
public class EmployeeController {

		@GetMapping("/employees")
		public List<Employee> emps(){
			
			return List.of(new Employee(1,"Ram",10000),new Employee(2,"Shyam",20000),new Employee(3,"Raju",30000));
			
		}
		
		@GetMapping("/employees/1")
		public Employee em() {
			
			return new Employee(1,"Ram",1000);
		}
		
}
