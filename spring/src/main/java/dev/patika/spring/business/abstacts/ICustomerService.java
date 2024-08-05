package dev.patika.spring.business.abstacts;

import dev.patika.spring.Customer;

import java.util.List;

public interface ICustomerService {
    Customer getById(int id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(int id);

    List<Customer> findAll();
}
