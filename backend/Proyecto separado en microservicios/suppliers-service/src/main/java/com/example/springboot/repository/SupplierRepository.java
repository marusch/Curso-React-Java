package com.example.springboot.repository;


import com.example.springboot.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long> {



}