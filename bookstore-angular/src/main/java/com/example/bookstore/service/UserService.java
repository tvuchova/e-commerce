package com.example.bookstore.service;

import java.util.Set;

import com.example.bookstore.domain.User;
import com.example.bookstore.domain.security.UserRole;



public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);

}
