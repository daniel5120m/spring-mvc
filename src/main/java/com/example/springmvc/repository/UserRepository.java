package com.example.springmvc.repository;

import com.example.springmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UserRepository extends JpaRepository<User, Id> {

}
