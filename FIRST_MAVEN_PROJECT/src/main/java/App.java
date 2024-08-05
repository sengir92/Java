import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();



        transaction.begin();
        /*
        //SELECT * FROM Categories WHERE category_id = 1;
        TypedQuery<Category> getAllCategories = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = :id", Category.class);
        getAllCategories.setParameter("id",1);
        Category category = getAllCategories.getSingleResult();
        System.out.println(category.getName());

        List<Category> categoryList = getAllCategories.getResultList();
        for (Category category1 : categoryList) {
            System.out.println(category1.getName());
        }
         */

        /*
        TypedQuery<Object[]> prodQuery = entityManager.createQuery("SELECT p.id,p.name,p.price FROM Product p WHERE p.price > 10",Object[].class);
        List<Object[]> prodCustomList = prodQuery.getResultList();

        for (Object[] obj : prodCustomList) {
            System.out.println("ID : " + obj[0] + " Name : " + obj[1] + " Price : " + obj[2]);
        }

         */

        /*
        //SELECT COUNT(category_id) as cnt FROM categories
        TypedQuery<Long> customQuery = entityManager.createQuery("SELECT COUNT(p.id) FROM Product p" , Long.class);
        Long productCount  = customQuery.getSingleResult();
        System.out.println(productCount);

        */

        /*
        //SELECT count(p.product_id), c.category_name FROM products as p LEFT JOIN categories as c ON p.product_category_id = c.category_id GROUP BY p.product_category_id
        TypedQuery<Object[]> customQuery = entityManager.createQuery("SELECT COUNT(p.id), cat.name FROM Product p LEFT JOIN p.category cat GROUP BY p.category.id",Object[].class);
        List<Object[]> categoryProductCount = customQuery.getResultList();

        for(Object[] objects : categoryProductCount) {
            System.out.println(objects[1] + " : " + objects[0] + " adet ürün bulunmaktadır.");
        }

         */

        /*
        TypedQuery<Product> query = entityManager.createQuery("SELECT prod FROM Product prod WHERE prod.name LIKE 'Ip%'",Product.class);
        List<Product> productList = query.getResultList();
        for(Product product : productList) {
            System.out.println(product.getName());
        }
          */

        /*
        TypedQuery<Product> allQuery = entityManager.createNamedQuery("Product.findAll", Product.class);
        List<Product> productList = allQuery.getResultList();
        for(Product product : productList) {
            System.out.println(product.getName());
        }

         */


        transaction.commit();


    }
}