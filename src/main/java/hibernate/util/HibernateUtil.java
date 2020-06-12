package hibernate.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import contacts.customer.ContactCustomer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author imssbora
 */
public class HibernateUtil {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                System.out.println("Starting Hibernate Configuration ");
                sessionFactory = new Configuration().configure(new File("/Users/gabrielecugliari/IdeaProjects/OperazioneFesta/hibernate.cfg.xml")).buildSessionFactory();
                System.out.println(" Hibernate Configuration Loaded");

            } catch (Exception e) {
                System.out.println("SessionFactory creation failed");
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
