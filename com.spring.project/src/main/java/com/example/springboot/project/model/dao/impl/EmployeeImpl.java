package com.example.springboot.project.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springboot.project.model.dao.EmployeeDao;

@Repository("employeeImpl")
public class EmployeeImpl implements EmployeeDao {

	@Override
	public List<String> getNames() {
		// TODO Auto-generated method stub
		return Arrays.asList("Fatma", "Arda", "Elmas","Hüseyin", "Mustafa", "Enver");
	}

}
