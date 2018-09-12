package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.User;
import com.company.project.po.UserDepartmentVo;
import com.company.project.po.UserRoleVo;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    List<UserDepartmentVo> getUserWithDepartment();
    List<UserRoleVo> getUserWithRole();

    List<User> getAllUserRoleDepByName(String name);

}