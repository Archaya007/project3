package com.kgisl.sb1.services;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kgisl.sb1.model.Customer;
import com.kgisl.sb1.repository.CustomerRepository;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    public CustomerRepository customerRepository;
    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    @Override
    public Customer createCustomer(Customer team) {
       return customerRepository.save(team);
    }
    @Override
    public Customer updateCustomer(Integer id, Customer team) {
        Customer s = customerRepository.getReferenceById(id);
        s.setFirstName(team.getFirstName());
        s.setLastName(team.getLastName());
        s.setEmail(team.getEmail());
        s.setId(team.getId());
        customerRepository.save(team);
        return customerRepository.save(team);
    }
    @Override
    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);      
    }
    @Override
    public List<Customer> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public List<Customer> findById() {
        // TODO Auto-generated method stub
        return null;
    }
}