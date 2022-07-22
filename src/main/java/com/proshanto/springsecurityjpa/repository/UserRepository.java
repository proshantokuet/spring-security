package com.proshanto.springsecurityjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proshanto.springsecurityjpa.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String username); 

}
