package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.model.Car;
import pl.k.kamil.java.model.CarStatus;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

public class NewCarMenu extends JFrame {

    private JTextField jTextFieldColor;
    private JTextField jTextFieldMark;
    private JTextField jTextFieldModel;
    private JTextField jTextFieldPrice;
    private JTextField jTextFieldRegNumber;

    public NewCarMenu() {
        initComponents();
    }

    private void initComponents() {

        JLabel jLabelRegNumber = new JLabel();
        JLabel jLabelMark = new JLabel();
        JLabel jLabelTitle = new JLabel();
        JLabel jLabelModel = new JLabel();
        JLabel jLabelColor = new JLabel();
        JLabel jLabelPrice = new JLabel();
        jTextFieldRegNumber = new JTextField();
        jTextFieldMark = new JTextField();
        jTextFieldModel = new JTextField();
        jTextFieldColor = new JTextField();
        jTextFieldPrice = new JTextField();
        JButton jButtonAdd = new JButton();
        JLabel jLabelCurrency = new JLabel();


        jLabelRegNumber.setText("Numer rejestracyjny : ");

        jLabelMark.setText("Marka:");

        jLabelTitle.setFont(new Font("Tahoma", 0, 20));
        jLabelTitle.setText("Nowy samochód:");

        jLabelModel.setText("Model:");

        jLabelColor.setText("Kolor:");

        jLabelPrice.setText("Cena za dzień:");

        jButtonAdd.setText("Dodaj");

        jButtonAdd.addActionListener(this::jButton1ActionPerformed);


        jLabelCurrency.setText("zł");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAdd)
                                .addGap(201, 201, 201))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(199, 199, 199)
                                                .addComponent(jLabelTitle))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelMark)
                                                        .addComponent(jLabelRegNumber)
                                                        .addComponent(jLabelModel)
                                                        .addComponent(jLabelColor)
                                                        .addComponent(jLabelPrice))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextFieldPrice, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabelCurrency))
                                                        .addComponent(jTextFieldMark, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldRegNumber, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldModel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldColor, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabelTitle)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelRegNumber)
                                        .addComponent(jTextFieldRegNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMark)
                                        .addComponent(jTextFieldMark, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelModel)
                                        .addComponent(jTextFieldModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelColor)
                                        .addComponent(jTextFieldColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPrice)
                                        .addComponent(jTextFieldPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCurrency))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(jButtonAdd)
                                .addGap(36, 36, 36))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {


        if (jTextFieldRegNumber.getText().equals("") || jTextFieldMark.getText().equals("") || jTextFieldModel.getText().equals("") || jTextFieldColor.getText().equals("") || jTextFieldPrice.getText().equals("")) {
            new ErrorMenu().emptyJTextField();
        } else if (!jTextFieldPrice.getText().chars().allMatch(Character::isDigit)) {
            new ErrorMenu().priceIsNotDigit(jTextFieldPrice.getText());
        } else {

            try {
                new CarDao().add(new Car(jTextFieldRegNumber.getText(), jTextFieldMark.getText(), jTextFieldModel.getText(), jTextFieldColor.getText(), BigDecimal.valueOf(Long.parseLong(jTextFieldPrice.getText())), CarStatus.FREE));
                JOptionPane.showMessageDialog(this, "Dodano samochód :\n" + jTextFieldRegNumber.getText() + " " + jTextFieldMark.getText(),"Dodano samochód", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (PersistenceException e) {
                 JOptionPane.showMessageDialog(this, "Samochód już istnieje", "Uwaga", JOptionPane.ERROR_MESSAGE);
            }


                }

            }

        }


