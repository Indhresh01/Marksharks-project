package com.indhresh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<UserData> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public UserData createUser(UserData userData) {
        return userRepository.save(userData);
    }

    public UserData updateUser(Long id, UserData userDetails) {
        if (userRepository.existsById(id)) {
            userDetails.setId(id);
            return userRepository.save(userDetails);
        }
        return null; // Or throw an exception
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<UserData> getAllUsers() {
        return userRepository.findAll();
    }
}
