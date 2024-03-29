package com.sael.springboot.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sael.springboot.rest.model.Employee;

@Repository
public interface Mydaorepository extends JpaRepository<Employee, Integer> {

}