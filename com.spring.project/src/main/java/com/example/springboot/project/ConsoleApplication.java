package com.example.springboot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.springboot.project.model.service.DepartmentService;
import com.example.springboot.project.model.service.EmployeeService;

public class ConsoleApplication implements CommandLineRunner {

	//Service katmanımızla da bu sınıf haberleşeceği için 
	//Servis sınıfını inject etik.
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	EmployeeService employeService;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Çalışan listesi="+employeService.getAll());
		System.out.println("Departman listesi="+departmentService.getAll());
		
	}

}
