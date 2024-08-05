package dev.patika.spring.business.concretes;

import dev.patika.spring.Customer;
import dev.patika.spring.business.abstacts.ICustomerService;
import dev.patika.spring.dao.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService {

    private final CustomerRepo customerRepo;

    public CustomerManager(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer getById(int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public void delete(int id) {
        this.customerRepo.delete(this.getById(id));
    }

    @Override
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }


}
