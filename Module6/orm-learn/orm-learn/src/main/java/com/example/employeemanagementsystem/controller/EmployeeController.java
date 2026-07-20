package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.DepartmentRepository;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    // CREATE Employee (under a specific Department ID)
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestParam Long departmentId, @RequestBody Employee employee) {
        return departmentRepository.findById(departmentId)
                .map(dept -> {
                    employee.setDepartment(dept);
                    return ResponseEntity.ok(employeeRepository.save(employee));
                })
                .orElse(ResponseEntity.badRequest().build());
    }

    // READ All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // READ Employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE Employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmp) {
        return employeeRepository.findById(id)
                .map(emp -> {
                    emp.setName(updatedEmp.getName());
                    emp.setEmail(updatedEmp.getEmail());
                    return ResponseEntity.ok(employeeRepository.save(emp));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE Employee
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Search by department name using custom JPQL query (Exercise 5)
    @GetMapping("/search/department")
    public List<Employee> getEmployeesByDepartmentName(@RequestParam String deptName) {
        return employeeRepository.findByDepartmentNameCustom(deptName);
    }

    // Search by email using Named Query (Exercise 5)
    @GetMapping("/search/email")
    public List<Employee> getEmployeeByEmailNamed(@RequestParam String email) {
        return employeeRepository.findByEmailNamed(email);
    }

    // Exercise 6: Pagination & Sorting Endpoint
    @GetMapping("/paged")
    public Page<Employee> getEmployeesPagedAndSorted(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "name") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }

    // Exercise 10: Batch Insert Endpoint
    @PostMapping("/batch")
    public ResponseEntity<String> saveEmployeesInBatch(@RequestBody List<Employee> employees) {
        employeeRepository.saveAll(employees);
        return ResponseEntity.ok("Batch insert completed for " + employees.size() + " employees.");
    }
}