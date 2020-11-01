package pl.k.kamil.java.logic;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.model.Car;
import pl.k.kamil.java.model.Customer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class SearchLogic {


    public TableModel allCustomerTable(){

        List<String[]> values = new ArrayList<String[]>();
        List<Customer> customers = new CustomerDao().findAll();
        for (Customer e : customers) {
            values.add(new String[]{String.valueOf(e.getId()),e.getFirstName(), e.getLastName(), e.getStreet(), e.getHouseNumber(), e.getPostalCode(), e.getCity()});
        }
        String[] column = {"ID","Imię", "Nazwisko", "Ulica", "Numer domu", "Kod pocztowy", "Miasto"};

        return new DefaultTableModel(values.toArray(new Object[][]{}), column);
    }

    public TableModel allCarTable(){

        List<String[]> values = new ArrayList<String[]>();
        List<Car> cars = new CarDao().findAll();
        for (Car e : cars) {
            values.add(new String[]{e.getRegNumber(), e.getMark(), e.getModel(), e.getColor(), String.valueOf(e.getPrice())});
        }
        String[] column = {"Numer rejestracyjny", "Marka", "Model", "Kolor", "cenaza dzień"};

        return new DefaultTableModel(values.toArray(new Object[][]{}), column);
    }

}
