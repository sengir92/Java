import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        //Create - Read - Update - Delete
        session.beginTransaction();
        try {

            Customer customer = new Customer();
            /*
            customer.setName("Hibernate Test");
            customer.setGender(Customer.GENDER.FEMALE);
            customer.setOnDate(LocalDate.now());
            customer.setMail("test@patika.dev");

            session.persist(customer);


           // customer = session.get(Customer.class,1);

            customer.setName("Değişti");
            session.persist(customer);

            session.remove(customer);


           // customer = session.byId(Customer.class).getReference(2);
           
             */

            /* HQL
            List<Customer> customers = session.createSelectionQuery("FROM Customer",Customer.class).getResultList();

            Customer customer1 = session.createSelectionQuery("FROM Customer WHERE id = 2", Customer.class).getSingleResult();

             */


            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
