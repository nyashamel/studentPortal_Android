package com.example.studentportal_android.controller;


        import com.example.studentportal_android.domain.Role;
        import com.example.studentportal_android.service.impl.RoleServiceImpl;
        import lombok.RequiredArgsConstructor;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("role")
public class RoleController {
    @Autowired
    private final RoleServiceImpl roleServiceImpl;

    @PostMapping("/role")
    public Role createRole(@RequestBody Role role) {
        return roleServiceImpl.createRole(role);
    }

    @GetMapping("/readRoles")
    public List<Role> getAllUsers() {
        List<Role> Roles = roleServiceImpl.getAllRoles();
        return Roles;
    }

    @PutMapping("/updateRoles/{roleId}")
    public Role updatedRole(@PathVariable Long roleId, @RequestBody Role role) {
        Role updatedRole = roleServiceImpl.updatedRoles(roleId, role);
        return updatedRole;
    }

    @DeleteMapping("/deleteRole/{roleId}")
    public void deleteRole(@PathVariable Long roleId) {
        roleServiceImpl.deleteRole(roleId);
    }
}