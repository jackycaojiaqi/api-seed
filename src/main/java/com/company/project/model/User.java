package com.company.project.model;

import lombok.Data;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Data
public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_gender")
    private String userGender;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_birthday")
    private Date userBirthday;

    @Column(name = "department_id")
    private Integer departmentId;

    //一对多，1个用户可能有多个角色。
    @Transient
    private List<Role> roles;

    //多对一，1个部门多个员工
    @Transient
    private Department department;
}