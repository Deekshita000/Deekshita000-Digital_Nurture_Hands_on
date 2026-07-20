package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Attempt;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.AttemptService;
import com.cognizant.orm_learn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static EmployeeService employeeService;
	private static AttemptService attemptService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		employeeService = context.getBean(EmployeeService.class);
		attemptService = context.getBean(AttemptService.class);

		LOGGER.info("Inside main");

		testGetAllPermanentEmployees();
		testGetAttempt();
		testGetAverageSalary();
		testGetAllEmployeesNative();
		testGetEmployee();
		testSaveEmployee();
	}

	public static void testGetAllPermanentEmployees() {
		LOGGER.info("Start: Get All Permanent Employees");
		List<Employee> employees = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees: {}", employees);
		employees.forEach(e -> LOGGER.debug("Skills: {}", e.getSkillList()));
		LOGGER.info("End: Get All Permanent Employees");
	}

	public static void testGetAttempt() {
		LOGGER.info("Start: Get Attempt");
		int userId = 1;
		int attemptId = 1;
		Attempt attempt = attemptService.getAttempt(userId, attemptId);
		LOGGER.debug("Attempt Details: {}", attempt);
		LOGGER.info("End: Get Attempt");
	}

	public static void testGetAverageSalary() {
		LOGGER.info("Start: Get Average Salary");
		int departmentId = 1;
		Double avgSalary = employeeService.getAverageSalary(departmentId);

		if (avgSalary != null) {
			LOGGER.debug("Average Salary for Department {}: {}", departmentId, avgSalary);
		} else {
			LOGGER.debug("No salary data found for Department {}", departmentId);
		}

		LOGGER.info("End: Get Average Salary");
	}

	public static void testGetAllEmployeesNative() {
		LOGGER.info("Start: Get All Employees Native");
		List<Employee> employees = employeeService.getAllEmployeesNative();
		LOGGER.debug("Native Query Employees: {}", employees);
		LOGGER.info("End: Get All Employees Native");
	}

	public static void testGetEmployee() {
		LOGGER.info("Start: Get Employee");
		Employee employee = employeeService.getEmployee(1);
		LOGGER.debug("Employee: {}", employee);
		LOGGER.info("End: Get Employee");
	}

	public static void testSaveEmployee() {
		LOGGER.info("Start: Save Employee");
		Employee employee = employeeService.getEmployee(1);
		if (employee != null) {
			employee.setSalary(80000.0);
			employeeService.saveEmployee(employee);
			LOGGER.debug("Updated Employee: {}", employee);
		} else {
			LOGGER.debug("Employee with ID 1 not found for save test.");
		}
		LOGGER.info("End: Save Employee");
	}
}