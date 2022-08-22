package com.example.springboot.repository;

import com.example.springboot.entities.Customer;
import com.example.springboot.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {



}