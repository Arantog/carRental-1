package pl.k.kamil.java.dao;

import org.hibernate.Session;
import pl.k.kamil.java.database.SessionProvider;
import pl.k.kamil.java.model.Customer;

public class CustomerDao extends AbstractDao{

    public CustomerDao(){
        super(Customer.class);

    }
    public Customer findCustomerById(int id) {
        Session session = SessionProvider.getSession();
        Customer record = session.find(Customer.class, id);
        session.close();
        return record;
    }

}
