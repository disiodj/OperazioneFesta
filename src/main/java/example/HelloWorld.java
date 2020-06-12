package example;
import contacts.Contact;
import contacts.customer.ContactCustomer;
import hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HelloWorld {

  public static void main(String[] argv) {
    System.out.println("Ciao mondo");
    Contact gabriele = new ContactCustomer();
    gabriele.setName("ciccioDajje");
// Prep Work
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    //persist example - with transaction
    Session session2 = sessionFactory.openSession();
    Transaction tx2 = session2.beginTransaction();
    session2.persist(gabriele);
    tx2.commit();
    System.out.println("*****");

    // Close resources
    sessionFactory.close();

  }

}
