package com.example.studentportal_android.service.impl;

import com.example.studentportal_android.domain.Faculty;
import com.example.studentportal_android.domain.Role;
import com.example.studentportal_android.repository.RoleRepository;
import com.example.studentportal_android.service.api.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    private final RoleRepository roleRepository;
@Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role createRole(Role role) {
        Role SavedRole = roleRepository.save(role);
        return SavedRole;
    }

    @Override
    public List<Role> getAllRoles() {
        List<Role> Roles = roleRepository.findAll();
        return Roles;
    }

    @Override
    public Role updatedRoles(Long roleId, Role role) {
    //find the Id provided
        Optional<Role> optionalRole = roleRepository.findById(roleId);
        //If found then update
        if (!optionalRole.isPresent()){
            return null;
        }
        Role existingRole = optionalRole.get();
        existingRole.setRoleName(role.getRoleName());

        //save
        Role updatedRole = roleRepository.save(existingRole);
        return updatedRole;
    }

    @Override
    public void deleteRole(Long roleId) {
    roleRepository.deleteById(roleId);

    }
}


