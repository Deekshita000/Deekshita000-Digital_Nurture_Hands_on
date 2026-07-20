package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.projection.EmployeeDto;
import com.example.employeemanagementsystem.projection.EmployeeSummaryInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived Query Methods
    List<Employee> findByNameContaining(String name);
    List<Employee> findByEmail(String email);
    List<Employee> findByDepartmentId(Long departmentId);

    // Custom JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
    List<Employee> findByDepartmentNameCustom(@Param("deptName") String deptName);

    // Named Query Execution
    List<Employee> findByEmailNamed(@Param("email") String email);

    // Pagination and Sorting Method
    Page<Employee> findByDepartmentId(Long departmentId, Pageable pageable);

    // Interface-Based Projection Method
    List<EmployeeSummaryInterface> findByDepartmentName(String departmentName);

    // Class-Based DTO Projection Method
    @Query("SELECT new com.example.employeemanagementsystem.projection.EmployeeDto(" +
            "e.id, e.name, e.email, e.department.name) " +
            "FROM Employee e WHERE e.id = :id")
    EmployeeDto findEmployeeDtoById(@Param("id") Long id);
}
