package com.example.springmvc.services;

import com.example.springmvc.model.User;
import com.example.springmvc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // konstruktor zawierający wymagane argumenty
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }


}
