package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<Employee> getAllPermanentEmployees() {
        LOGGER.info("Start: getAllPermanentEmployees");
        return employeeRepository.getAllPermanentEmployees();
    }

    @Transactional(readOnly = true)
    public Double getAverageSalary(int id) {
        LOGGER.info("Start: getAverageSalary");
        return employeeRepository.getAverageSalary(id);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAllEmployeesNative() {
        LOGGER.info("Start: getAllEmployeesNative");
        return employeeRepository.getAllEmployeesNative();
    }

    @Transactional(readOnly = true)
    public Employee getEmployee(int id) {
        LOGGER.info("Start: getEmployee");
        return employeeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveEmployee(Employee employee) {
        LOGGER.info("Start: saveEmployee");
        employeeRepository.save(employee);
        LOGGER.info("End: saveEmployee");
    }
}