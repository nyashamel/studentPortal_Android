package com.example.studentportal_android.service.impl;

import com.example.studentportal_android.domain.User;
import com.example.studentportal_android.repository.UserRepository;
import com.example.studentportal_android.service.api.IUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserInterface {
    private final UserRepository userRepository;
@Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> getUsers = userRepository.findAll();
        return getUsers;
    }

    @Override
    public User updatedUser(Long userId, User user) {
        //find the ID provided
        Optional<User> optionalUser = userRepository.findById(userId);

        //If found then update
        if(!optionalUser.isPresent()){
            return null;
        }
        User existingUser = optionalUser.get();
        existingUser.setFullName(user.getFullName());
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setEnabled(user.isEnabled());
        existingUser.setLocked(user.getLocked());

        //save
        User updatedUser = userRepository.save(existingUser);
        return  updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
    userRepository.deleteById(userId);

    }
}
