package com.example.studentportal_android.repository;

import com.example.studentportal_android.domain.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeRepository extends JpaRepository<Degree,Long> {

}
