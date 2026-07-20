package com.example.employeemanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@NamedQueries({
        @NamedQuery(
                name = "Employee.findByEmailNamed",
                query = "SELECT e FROM Employee e WHERE e.email = :email"
        )
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @JsonIgnoreProperties("employees")
    private Department department;
}

