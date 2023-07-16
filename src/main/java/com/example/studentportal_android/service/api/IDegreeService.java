package com.example.studentportal_android.service.api;

import domain.Degree;

import java.util.List;

public interface IDegreeService {
    //Create operation
    Degree createDegree(Degree degree);
    //Read Operation
    List<Degree> getAllDegrees();
    //Update Operation
    Degree updateDegree (Long degreeId, Degree degree);
    //Delete Operation
    void  deleteDegree (Long degreeId);
}
