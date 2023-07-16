package com.example.studentportal_android.service.impl;

import com.example.studentportal_android.repository.DegreeRepository;
import com.example.studentportal_android.service.api.IDegreeService;
import com.example.studentportal_android.domain.Degree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DegreeServiceImpl implements IDegreeService {

    private final DegreeRepository degreeRepository;

    @Autowired
    public DegreeServiceImpl(DegreeRepository degreeRepository) {
        this.degreeRepository = degreeRepository;
    }

    @Override
    public Degree createDegree(Degree degree) {
        Degree saveDegree = degreeRepository.save(degree);
        return saveDegree;
    }

    @Override
    public List<Degree> getAllDegrees() {
        List<Degree> Degrees = degreeRepository.findAll();
        return Degrees;
    }

    @Override
    public Degree updatedDegree(Long degreeId, Degree degree) {
        Optional<Degree> optionalDegree = degreeRepository.findById(degreeId);
        //If found update
        if (!optionalDegree.isPresent()) {
            return null;
        }
        Degree existingDegree = optionalDegree.get();
        existingDegree.setDegreeName(degree.getDegreeName());
        existingDegree.setDegreeLength(degree.getDegreeLength());

        //save
        Degree updatedStudent = degreeRepository.save(existingDegree);
        return updatedStudent;
    }


    @Override
    public void deleteDegree(Long degreeId) {
        degreeRepository.deleteById(degreeId);

    }
}
