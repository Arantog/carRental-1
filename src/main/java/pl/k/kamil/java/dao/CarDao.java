package pl.k.kamil.java.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.k.kamil.java.database.SessionProvider;
import pl.k.kamil.java.model.Car;

public class CarDao extends AbstractDao {

    public CarDao() {
        super(Car.class);
    }

    public void deleteCarById(String id) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.find(Car.class, id));
        transaction.commit();
        session.close();
    }
}
