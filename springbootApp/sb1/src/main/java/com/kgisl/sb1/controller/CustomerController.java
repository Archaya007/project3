package com.kgisl.sb1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.webservices.client.HttpWebServiceMessageSenderBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.kgisl.sb1.model.Customer;
import com.kgisl.sb1.services.CustomerService;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<Customer>> getAll() {
        return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getTeamById(@PathVariable("id") int id) {
        Customer customer = CustomerService.findByCustomerId(id);
        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}