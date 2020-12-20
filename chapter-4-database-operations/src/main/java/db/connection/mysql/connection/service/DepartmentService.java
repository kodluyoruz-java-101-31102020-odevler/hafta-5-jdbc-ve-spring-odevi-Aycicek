package db.connection.mysql.connection.service;

import java.util.List;
import java.util.Set;

import db.connection.mysql.connection.dao.DepartmentDAO;
import db.connection.mysql.connection.model.Department;
import db.connection.mysql.connection.model.Employee;

public class DepartmentService {

	private DepartmentDAO departmentDAO;

	public DepartmentService(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	// burada tüm departmanları listeleyen fonksiyonu yazınız.

	public List<Department> getDepartments() {

		return this.departmentDAO.getAll();
	}
	

	public List<Department> findAll() {

		return this.departmentDAO.getAll();
	}
}
