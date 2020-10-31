package pl.k.kamil.java.menu;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchMenu {

    SearchMenu(){
        JFrame f=new JFrame("Wszyscy klienci");
        final JTextField tf=new JTextField();


        JButton allCustomers=new JButton("Wszyscy klienci");
        allCustomers.setBounds(50,200,200,30);

        JButton allCars =new JButton("Wszystkie samochody");
        allCars.setBounds(250,200,200,30);

        JButton allRents =new JButton("Wszystkie wypożyczenia");
        allRents.setBounds(450,200,200,30);

        JButton freeCars =new JButton("Wszystkie wypożyczenia");
        freeCars.setBounds(450,200,200,30);


        allCustomers.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new SearchAllCustomer();
            }
        });


        f.add(allCustomers);
        f.add(allCars);
        f.add(allRents);
        f.add(freeCars);


        f.add(tf);
        f.setSize(1000,400);
        f.setLayout(null);
        f.setVisible(true);



    }
}
