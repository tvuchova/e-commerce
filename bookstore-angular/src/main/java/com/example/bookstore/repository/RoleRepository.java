package com.example.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bookstore.domain.security.Role;



public interface RoleRepository extends CrudRepository<Role, Long> {

}
