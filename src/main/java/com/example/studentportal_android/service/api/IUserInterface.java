package com.example.studentportal_android.service.api;

import com.example.studentportal_android.domain.User;

import java.util.List;

public interface IUserInterface {
    //Create operation
    User createUser(User user);
    //Read Operation
    List<User> getAllUsers();
    //Update Operation
    User updateUser (Long userId, User user);
    //Delete Operation
    void  deleteUser (Long userId);
}
