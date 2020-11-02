package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.model.Car;
import pl.k.kamil.java.model.CarStatus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class NewCarMenu {

    NewCarMenu() {
        JFrame f = new JFrame("Nowy Samochód");

        JLabel lRegNumber, lMark, lModel, lColor, lPrice, lCurrency;
        JTextField tRegNumber, tMark, tModel, tColor, tPrice;
        JButton b;

        lRegNumber = new JLabel("Numer rejestracyjny :");
        lRegNumber.setBounds(50, 50, 150, 30);
        tRegNumber = new JTextField();
        tRegNumber.setBounds(200, 50, 300, 30);


        lMark = new JLabel("Marka: ");
        lMark.setBounds(50, 100, 100, 30);
        tMark = new JTextField();
        tMark.setBounds(200, 100, 300, 30);

        lModel = new JLabel("Model :");
        lModel.setBounds(50, 150, 100, 30);
        tModel = new JTextField();
        tModel.setBounds(200, 150, 300, 30);

        lColor = new JLabel("Kolor:");
        lColor.setBounds(50, 200, 100, 30);
        tColor = new JTextField();
        tColor.setBounds(200, 200, 300, 30);

        lPrice = new JLabel("Cena za dzień:");
        lPrice.setBounds(50, 250, 100, 30);
        tPrice = new JTextField();
        tPrice.setBounds(200, 250, 250, 30);
        lCurrency = new JLabel("zł");
        lCurrency.setBounds(460, 250, 100, 30);

        b = new JButton("Dodaj");
        b.setBounds(300, 400, 95, 30);


        f.add(lRegNumber);
        f.add(lMark);
        f.add(tRegNumber);
        f.add(tMark);
        f.add(lModel);
        f.add(tModel);
        f.add(lColor);
        f.add(tColor);
        f.add(lPrice);
        f.add(tPrice);
        f.add(lCurrency);

        f.add(b);

        f.setSize(600, 500);
        f.setLayout(null);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {

                if (tRegNumber.getText().equals("") || tMark.getText().equals("") || tModel.getText().equals("") || tColor.getText().equals("") ||tPrice.getText().equals("") ) {
                    new ErrorMenu().emptyJTextField();
                }  else if (!tPrice.getText().chars().allMatch(Character::isDigit)){
                    new ErrorMenu().priceIsNotDigit(tPrice.getText());
                }else {
                    new CarDao().add(new Car(tRegNumber.getText(), tMark.getText(), tModel.getText(), tColor.getText(), BigDecimal.valueOf(Long.parseLong(tPrice.getText())), CarStatus.FREE));
                    JOptionPane.showMessageDialog(b, "Dodano samochód  :" + tRegNumber.getText() + " " + tMark.getText());
                    f.dispose();
                }


            }
        });


    }

}