package com.company.project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class Role {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    //一对多，1个角色也可能被多个用户拥有,所以是list
    @Transient
    private List<User> users;
}