package business.concretes;

import business.abstracts.ICustomerSevice;
import dao.abstracts.ICustomerDao;
import entities.Customer;

import java.util.List;

public class CustomerManager implements ICustomerSevice {

    private final ICustomerDao customerDao;

    //Dependency Inhection
    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        Customer checkMailCustomer = this.customerDao.findByMail(customer.getMail());
        if(checkMailCustomer != null) {
            throw  new RuntimeException(customer.getMail() + "bu e-posta adresi daha önceden eklenmiş");
        }
        this.customerDao.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return this.customerDao.findById(id);
    }

    @Override
    public void update(Customer customer) {
        Customer checkMailCustomer = this.customerDao.findByMail(customer.getMail());
        if (checkMailCustomer != null && checkMailCustomer.getId() != customer.getId() ){
            throw new RuntimeException(customer.getMail() + "bu e-posta adresi önceden eklenmiş");
        }
        this.customerDao.update(customer);
    }

    @Override
    public void deleteById(int id) {
        Customer customer = this.customerDao.findById(id);
        this.customerDao.delete(customer);
    }

    @Override
    public List<Customer> findAll() {
        return this.customerDao.findAll();
    }
}