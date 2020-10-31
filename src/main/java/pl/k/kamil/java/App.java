package pl.k.kamil.java;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.dao.RentDao;
import pl.k.kamil.java.menu.MainMenu;
import pl.k.kamil.java.model.Address;
import pl.k.kamil.java.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
      CarDao carDao = new CarDao();
        CustomerDao customerDao = new CustomerDao();
        RentDao rentDao = new RentDao();

//        Customer test = new Customer("KAmil","Kobrzeniecki",new Address("test","3","test","654"));
//        customerDao.add(test);
//        customerDao.add(new Customer("test","test2"));
//
//        customerDao.add(new Customer("KAmil2","Kobrzeniecki2",new Address("test","3","test","654")));
        new MainMenu();
    }
}
