package com.example.studentportal_android.service.impl;

import com.example.studentportal_android.repository.FacultyRepository;
import com.example.studentportal_android.service.api.IFacultyService;
import com.example.studentportal_android.domain.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements IFacultyService {

    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty createFaculty(Faculty faculty) {
        Faculty SavedFaculty = facultyRepository.save(faculty);
        return  SavedFaculty;

    }

    @Override
    public List<Faculty> getAllFaculty() {
        List<Faculty> getFaculties = facultyRepository.findAll();
        return getFaculties;
    }

    @Override
    public Faculty updateFaculty(Long facultyId, Faculty faculty) {
        //find the Id Provided
        Optional<Faculty> optionalFaculty = facultyRepository.findById(facultyId);

        //If found then update
        if (!optionalFaculty.isPresent()){
            return  null;
        }
        Faculty existingFaculty = optionalFaculty.get();
        existingFaculty.setFacultyName(faculty.getFacultyName());
        existingFaculty.setGetFacultyHead(faculty.getGetFacultyHead());
        existingFaculty.setDegreeId(faculty.getDegreeId());

        //save
        Faculty updatedFaculty = facultyRepository.save(existingFaculty);
        return updatedFaculty;
    }

    @Override
    public void deleteFaculty(Long facultyId) {
        facultyRepository.deleteById(facultyId);

    }
}
