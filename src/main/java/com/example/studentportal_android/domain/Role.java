package com.example.studentportal_android.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    private String roleName;
    private Long roleId;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_Id",nullable = false)
    public Long getRoleId() {
        return roleId;
    }


}

