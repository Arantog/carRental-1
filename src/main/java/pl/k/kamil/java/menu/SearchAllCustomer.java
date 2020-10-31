package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.model.Customer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class SearchAllCustomer {
    JFrame f;

    SearchAllCustomer() {

        List<String[]> values = new ArrayList<String[]>();
        List<Customer> customers = new CustomerDao().findAll();


        for (Customer e : customers) {
            values.add(new String[]{e.getFirstName(), e.getLastName(), e.getStreet(), e.getHouseNumber(), e.getPostalCode(), e.getCity()});
        }

        String[] column = {"Imię", "Nazwisko", "Ulica", "Numer domu", "Kod pocztowy", "Miasto"};
        f = new JFrame();

        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][]{}), column);
        JTable jt = new JTable(tableModel);
        jt.setBounds(100, 100, 800, 800);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(800, 800);
        f.setVisible(true);
        jt.getSelectedRow();

        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;

                System.out.println(jt.getSelectedRow());
                System.out.println(jt.getSelectedColumn());


            }
        });
    }
}

