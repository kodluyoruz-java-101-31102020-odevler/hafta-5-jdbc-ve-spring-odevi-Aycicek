package com.example.springboot.project.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.project.model.dao.DepartmentDao;
import com.example.springboot.project.model.dao.impl.DepartmentImpl;
import com.example.springboot.project.model.service.DepartmentService;

//Sevice sınıfları @Service annotation ile spring context e inject edilir.
@Service("departmentImplService")
public class DepartmentImplService implements DepartmentService{

	//Dependency inversion yaptık
	//İhtiyaç duyduğumuz dependency i interface tipinde tuttuk ve o şekilde inject ettik.
	@Autowired
	DepartmentDao departmentDoa;
	
	@Override
	public List<String> getAll() {
		
		return departmentDoa.getDepartmentName();
	}

}
