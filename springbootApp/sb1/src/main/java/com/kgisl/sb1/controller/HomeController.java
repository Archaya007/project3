package com.kgisl.sb1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.sb1.model.Customer;


@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/")
    public List<Customer> welcome(){
        List<Customer> customers= new ArrayList<Customer>();  

        customers.add(new Customer(1,"Archu","Latchu","psm@gmail.com"));
        return customers;
    }
}
