package com.example.studentportal_android.repository;

import com.example.studentportal_android.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
