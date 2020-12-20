package com.example.springboot.project.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springboot.project.model.dao.DepartmentDao;


//Dao katmanları @Repository annotation ile spring context e dahil edilir.
@Repository("departmentImpl")
public class DepartmentImpl implements DepartmentDao {

	@Override
	public List<String> getDepartmentName() {
		
		return Arrays.asList("Mühendislik","Pazarlama","Reklam","İnsan kaynakları","Yönetim");
	}
	
	

}
