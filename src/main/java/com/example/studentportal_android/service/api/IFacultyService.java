package com.example.studentportal_android.service.api;

import com.example.studentportal_android.domain.Faculty;

import java.util.List;

public interface IFacultyService  {
    //Create operation
    Faculty createFaculty(Faculty faculty);
    //Read Operation
    List<Faculty> getAllFaculties();
    //Update Operation
    Faculty updatedFaculty (Long facultyId, Faculty faculty);
    //Delete Operation
    void  deleteFaculty (Long facultyId);
}
