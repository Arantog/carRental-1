package pl.k.kamil.java.menu;

import org.hibernate.sql.Update;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateMenu {


    UpdateMenu(){
        JFrame f=new JFrame("Aktualizacja bazy");
        final JTextField tf=new JTextField();


        JButton newCustomer=new JButton("Nowy klient");
        newCustomer.setBounds(50,200,200,30);

        JButton newCar =new JButton("Nowy samochód");
        newCar.setBounds(250,200,200,30);

        JButton updateCustomer =new JButton("Aktualizacja klienta");
        updateCustomer.setBounds(450,200,200,30);

        JButton updateCar =new JButton("Aktualizacja samochodu");
        updateCar.setBounds(450,200,200,30);


        newCustomer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new NewCustomerMenu();
            }
        });
        newCar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new NewCarMenu();
            }
        });


        f.add(newCustomer);
        f.add(newCar);
        f.add(updateCustomer);
        f.add(updateCar);


        f.add(tf);
        f.setSize(1000,400);
        f.setLayout(null);
        f.setVisible(true);



    }
}
