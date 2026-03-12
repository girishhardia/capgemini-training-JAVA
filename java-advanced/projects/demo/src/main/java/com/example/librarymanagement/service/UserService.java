package com.example.librarymanagement.service;

import com.example.librarymanagement.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        user.setId(users.size() + 1);
        users.add(user);
    }

    public boolean login(String email, String password) {
        return users.stream()
                .anyMatch(u -> u.getEmail().equals(email) && u.getPassword().equals(password));
    }

    public Optional<User> findByEmail(String email) {
        return users.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst();
    }
}
