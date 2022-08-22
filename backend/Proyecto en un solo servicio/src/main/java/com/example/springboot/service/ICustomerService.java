package com.example.springboot.service;

import com.example.springboot.entities.Customer;

import java.util.List;

public interface ICustomerService {

 List<Customer> getAll();


 Customer getById(Long id);


 void remove(Long id);

 void save(Customer customer);
}
