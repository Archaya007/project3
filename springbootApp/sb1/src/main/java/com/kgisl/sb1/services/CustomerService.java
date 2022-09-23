
package com.kgisl.sb1.services;
import java.util.List;
import com.kgisl.sb1.model.Customer;
public interface CustomerService {
    public List<Customer> getCustomers();
    public static Customer findByCustomerId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    public Customer createCustomer(Customer team);
    public Customer updateCustomer(Integer id,Customer team);
    public void deleteCustomerById(Integer id);
    public List<Customer> findAll();
    public Object findById(int id);
    public List<Customer> findById();  
}