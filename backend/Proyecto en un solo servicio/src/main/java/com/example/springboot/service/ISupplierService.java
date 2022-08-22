package com.example.springboot.service;


import com.example.springboot.entities.Customer;
import com.example.springboot.entities.Supplier;

import java.util.List;

public interface ISupplierService {

    List<Supplier> getAll();


    Supplier getById(Long id);


    void remove(Long id);

    void save(Supplier supplier);
}
