package com.example.studentportal_android.repository;

import com.example.studentportal_android.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
