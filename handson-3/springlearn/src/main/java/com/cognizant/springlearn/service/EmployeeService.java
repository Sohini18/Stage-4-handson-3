package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.model.Employee;

@Service
public class EmployeeService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeService() {
		LOGGER.debug("HEY THERE, THIS IS EMPLOYEE SERVICE");
	}

	public List<Employee> getallEmployee() {
		return employeeDao.getallEmployee();
	}
	
}