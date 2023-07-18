package com.example.studentportal_android.controller;

import com.example.studentportal_android.domain.Degree;
import com.example.studentportal_android.service.api.IDegreeService;
import com.example.studentportal_android.service.impl.DegreeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor

public class DegreeController {

    private final IDegreeService iDegreeService;



    @PostMapping("/degree")
    public Degree createDegree(@RequestBody Degree degree) {
        return iDegreeService.createDegree(degree);
    }

    @GetMapping("/read")
    public List<Degree> getAllDegrees() {
        List<Degree> degrees = iDegreeService.getAllDegrees();
        return degrees;
    }
    @PutMapping("/update/{degreeId}")
    public Degree updateDegree(@PathVariable Long degreeId, @RequestBody Degree degree) {
        Degree updatedDegree = iDegreeService.updatedDegree(degreeId, degree);
        return updatedDegree;
    }
    @DeleteMapping("/delete/{degreeId}")
    public void deleteDegree(@PathVariable Long degreeId) {
        iDegreeService.deleteDegree(degreeId);
    }
}
