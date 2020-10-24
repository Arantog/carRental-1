package pl.k.kamil.java.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends Frame {


    public static void main(String[] args) {
        JFrame f=new JFrame("Wypożyczalnia samochodów");
        final JTextField tf=new JTextField();

        tf.setBounds(50,50, 150,20);
        JButton rent=new JButton("Nowe wypożyczenie");
        rent.setBounds(50,200,200,30);

        JButton carReturn =new JButton("Zwrot");
        carReturn.setBounds(250,200,200,30);

        JButton update =new JButton("Aktualizacja");
        update.setBounds(450,200,200,30);

        JButton search =new JButton("Wyszukiwanie");
        search.setBounds(650,200,200,30);

        rent.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Javatpoint.");
            }
        });
        f.add(rent);
        f.add(carReturn);
        f.add(update);
        f.add(search);

        f.add(tf);
        f.setSize(1000,800);
        f.setLayout(null);
        f.setVisible(true);
    }
}







