package com.example.studentportal_android.repository;

import com.example.studentportal_android.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository <Faculty, Long>{
}
