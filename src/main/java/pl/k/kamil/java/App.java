package pl.k.kamil.java;

import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.menu.MainMenu;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

//        List values = new CustomerDao().findAll();
//        Object[] array;
//        array = values.toArray();




       // Car car=new Car("ABC123","Test","125p","czerwony", BigDecimal.valueOf(Long.parseLong("125")),"free");
        //carDao.add(car);

     //
//        Customer test = new Customer("KAmil","Kobrzeniecki",new Address("test","3","test","654"));
//        customerDao.add(test);
//        customerDao.add(new Customer("test","test2"));
//
//        customerDao.add(new Customer("KAmil2","Kobrzeniecki2",new Address("test","3","test","654")));
      new MainMenu();
    }
}
