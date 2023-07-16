package com.example.studentportal_android.controller;

import com.example.studentportal_android.domain.Faculty;
import com.example.studentportal_android.service.api.IFacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FacultyController {
    private final IFacultyService iFacultyService;

    //Create
    @PostMapping("/faculty")
    public Faculty createStudent(@RequestBody Faculty faculty){
        return iFacultyService.createFaculty(faculty);
    }
    //read
    @GetMapping("/readfaculty")
    public List<Faculty> getAllFaculty() {
        List<Faculty> faculties = iFacultyService.getAllFaculties();
        return faculties;

    }
    //update
    @PutMapping("/update/{facultyId}")
    public Faculty updateFaculty(@PathVariable Long facultyId, @RequestBody Faculty faculty ){
        Faculty updatedFaculty = iFacultyService.updatedFaculty(facultyId, faculty);
        return updatedFaculty;
    }

    //Delete
    @DeleteMapping("/delete/{facultyId}")
    public void deleteFaculty(@PathVariable Long facultyId) {
        iFacultyService.deleteFaculty(facultyId);
    }

}
