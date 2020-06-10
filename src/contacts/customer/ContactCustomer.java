package contacts.customer;

import contacts.Contact;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.*;

@Entity
public class ContactCustomer  implements Contact {
    public String contactID = "";
    public String name= "";
    public ContactCustomer(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getContactID(){
        return this.contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
