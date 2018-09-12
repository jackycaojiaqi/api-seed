package com.company.project.po;

import com.company.project.model.Department;
import com.company.project.model.Role;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
public class UserRoleVo {
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
    private List<Role> roles;

}