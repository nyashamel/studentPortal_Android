package com.example.studentportal_android.controller;

import com.example.studentportal_android.domain.User;
import com.example.studentportal_android.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserServiceImpl userServiceImpl;


    //Create
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    //read
    @GetMapping("/readUsers")
    public List<User> getAllUsers() {
        List<User> Users = userServiceImpl.getAllUsers();
        return Users;
    }

    //update
    @PutMapping("/updateUser/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        User updatedUser = userServiceImpl.updatedUser(userId, user);
        return updatedUser;
    }

    //Delete
    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userServiceImpl.deleteUser(userId);
    }


}


