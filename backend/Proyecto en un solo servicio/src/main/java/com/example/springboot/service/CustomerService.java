package com.example.springboot.service;


import com.example.springboot.entities.Customer;
import com.example.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll(){
    return (List<Customer>) repository.findAll();

    }

    @Override
    public Customer getById(Long id) {
        return (Customer) repository.findById(id).get();
    }


    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }


    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }
}
