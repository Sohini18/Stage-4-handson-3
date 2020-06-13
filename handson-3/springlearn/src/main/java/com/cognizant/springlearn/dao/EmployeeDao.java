package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Employee;

@Repository
public class EmployeeDao {
	public static List<Employee> EMPLOYEE_LIST = new ArrayList<Employee>();

	public EmployeeDao() {
		ApplicationContext apx = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList<Employee>) apx.getBean("employeeList");
	    
	}

	public List<Employee> getallEmployee() {
		return EMPLOYEE_LIST;
	}
}