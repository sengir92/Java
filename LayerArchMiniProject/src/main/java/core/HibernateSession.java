package core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    public static Session session = null;

    public static Session getSession() {
        if(session == null) {
            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Configuration.class)
                    .buildSessionFactory();

            session = factory.openSession();
        }
        return session;
    }
}
