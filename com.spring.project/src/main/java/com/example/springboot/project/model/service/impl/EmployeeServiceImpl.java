package com.example.springboot.project.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.project.model.dao.EmployeeDao;
import com.example.springboot.project.model.service.EmployeeService;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
	
	//DAO sınıfımız ile service sınıfımızı haberleştirebilmek için 
	//İlgili sınıfın interface i ile inject ettik.
	
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<String> getAll() {
		
		return employeeDao.getNames();
	}

}
