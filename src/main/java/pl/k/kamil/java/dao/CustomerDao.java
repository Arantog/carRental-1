package pl.k.kamil.java.dao;

import org.hibernate.Session;
import pl.k.kamil.java.database.SessionProvider;
import pl.k.kamil.java.model.Customer;

import java.util.List;

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

    public List<Customer> findCustomerByAll(int id,String firstName, String lastName, String street, String houseNumber, String city, String postalCode) {
        Session session = SessionProvider.getSession();
        List<Customer> records = session.createQuery("from Customer where  id = :id and firstName =:firstName and lastName =:lastName and street =:street and houseNumber =:houseNumber and city =:city and postalCode =:postalCode", Customer.class)
                .setParameter("id", id)
                .setParameter("firstName",firstName)
                .setParameter("lastName",lastName)
                .setParameter("street",street)
                .setParameter("houseNumber",houseNumber)
                .setParameter("city",city)
                .setParameter("postalCode",postalCode)
                .list();
        session.close();

        return records;
    }

}
