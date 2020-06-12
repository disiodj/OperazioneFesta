package contacts.customer;

import contacts.Contact;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="ContactCustomer")
public class ContactCustomer  implements Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="idcontactcustomer")
    public int contactID = 0;
    @Column(name="name")
    public String name= "";

    public ContactCustomer(){
    }

    public int getContactID(){
        return this.contactID;
    }

    public void setContactID(int contactID) {
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
