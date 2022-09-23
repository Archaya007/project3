package com.kgisl.sb1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.sb1.model.Customer;

@Repository

public interface  CustomerRepository extends JpaRepository<Customer, integer> {

    Customer getReferenceById(Integer id);

    void deleteById(Integer id);

    
}
