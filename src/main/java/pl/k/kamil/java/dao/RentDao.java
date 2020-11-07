package pl.k.kamil.java.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.k.kamil.java.database.SessionProvider;
import pl.k.kamil.java.model.Rent;
import pl.k.kamil.java.model.RentStatus;

import java.util.List;

public class RentDao extends AbstractDao {

    public RentDao(){
        super(Rent.class);
    }


    public List<Rent> findAllRentByStatus (RentStatus rentStatus){
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        List<Rent> records = session.createQuery("from Rent where rentStatus = :rentStatus", Rent.class)
                .setParameter("rentStatus", rentStatus)
                .list();
        transaction.commit();
        session.close();
        return records;
    }
}
