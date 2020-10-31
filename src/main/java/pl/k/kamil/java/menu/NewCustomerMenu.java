package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.model.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCustomerMenu {

    NewCustomerMenu() {
        JFrame f = new JFrame("Nowy klient");

        JLabel lFirstName, lLastname, lStreet, lHouseNumber, lPostalCode, lCity;
        JTextField tFirstname, tLastName, tStreet, tHouseNumber, tPostalCode, tCity;
        JButton b;

        lFirstName = new JLabel("Imię :");
        lFirstName.setBounds(50, 50, 100, 30);
        tFirstname = new JTextField();
        tFirstname.setBounds(150, 50, 300, 30);


        lLastname = new JLabel("Nazwisko: ");
        lLastname.setBounds(50, 100, 100, 30);
        tLastName = new JTextField();
        tLastName.setBounds(150, 100, 300, 30);

        lStreet = new JLabel("Ulica :");
        lStreet.setBounds(50, 150, 100, 30);
        tStreet = new JTextField();
        tStreet.setBounds(150, 150, 300, 30);

        lHouseNumber = new JLabel("Numer domu:");
        lHouseNumber.setBounds(50, 200, 100, 30);
        tHouseNumber = new JTextField();
        tHouseNumber.setBounds(150, 200, 300, 30);

        lPostalCode = new JLabel("Kod pocztowy:");
        lPostalCode.setBounds(50, 250, 100, 30);
        tPostalCode = new JTextField();
        tPostalCode.setBounds(150, 250, 300, 30);

        lCity = new JLabel("Miasto:");
        lCity.setBounds(50, 300, 100, 30);
        tCity = new JTextField();
        tCity.setBounds(150, 300, 300, 30);

        b = new JButton("Dodaj");
        b.setBounds(300, 400, 95, 30);


        f.add(lFirstName);
        f.add(lLastname);
        f.add(tFirstname);
        f.add(tLastName);
        f.add(lStreet);
        f.add(tStreet);
        f.add(lHouseNumber);
        f.add(tHouseNumber);
        f.add(lPostalCode);
        f.add(tPostalCode);
        f.add(lCity);
        f.add(tCity);
        f.add(b);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tFirstname.getText().equals("") || tLastName.getText().equals("") || tStreet.getText().equals("") || tCity.getText().equals("") || tHouseNumber.getText().equals("") || tPostalCode.getText().equals("")) {
                    new ErrorMenu().emptyJTextField();
                } else {

                    new CustomerDao().add(new Customer(tFirstname.getText(), tLastName.getText(), tStreet.getText(),
                            tHouseNumber.getText(), tCity.getText(), tPostalCode.getText()));
                    JOptionPane.showMessageDialog(b, "Dodano :" + tFirstname.getText() + " " + tLastName.getText());
                    f.dispose();

                }
            }
        });


    }
}
