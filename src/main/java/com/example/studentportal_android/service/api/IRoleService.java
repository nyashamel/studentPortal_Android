package com.example.studentportal_android.service.api;

import com.example.studentportal_android.domain.Role;

import java.util.List;

public interface IRoleService {
    //Create operation
    Role createRole(Role role);
    //Read Operation
    List<Role> getAllRoles();
    //Update Operation
    Role updateRoles (Long roleId, Role role);
    //Delete Operation
    void  deleteRole (Long roleId);
}
