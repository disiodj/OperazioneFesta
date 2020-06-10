package example;
import contacts.Contact;
import contacts.customer.ContactCustomer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

public class HelloWorld {

  public static void main(String[] argv) {
    System.out.println("Ciao mondo");
    Contact gabriele = new ContactCustomer();
    gabriele.setName("gabriele");
  }
}
