package com.company.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Department {
    @Id
    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "department_name")
    private String departmentName;


}