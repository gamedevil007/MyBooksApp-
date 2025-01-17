package com.stackroute.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackroute.userservice.model.User;


public interface UserRepository extends JpaRepository<User, String> {
	User findByUserIdAndPassword(String userId,String password);
}
