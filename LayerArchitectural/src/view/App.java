package view;

import business.concretes.CustomerManager;
import dao.concretes.CustomerHibernateDao;
import entities.Customer;

public class App {
    public static void main(String[] args) {
        //Presentation Layer

        Customer customer = new Customer();
        customer.setName("Test");
        customer.setMail("test@patika.dev");

        //Dependency Injection
        CustomerManager customerManager = new CustomerManager(new CustomerHibernateDao());
        customerManager.save(customer);

        Customer test = customerManager.getById(1);
    }
}
