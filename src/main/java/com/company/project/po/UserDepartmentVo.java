package com.company.project.po;

import com.company.project.model.Department;
import com.company.project.model.Role;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

@Data
public class UserDepartmentVo {
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

    //多对一，1个部门多个员工
    private Department department;
}