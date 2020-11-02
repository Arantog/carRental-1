package pl.k.kamil.java.menu;

import pl.k.kamil.java.logic.ToUpdateEdit;
import pl.k.kamil.java.logic.SearchLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchMenu extends JFrame {

        private JButton customer;
        private JLabel jLabel1;
        private JButton car;
        private JButton rent;

        public SearchMenu() {
            initComponents();
        }



        private void initComponents() {

            car = new JButton();
            customer = new JButton();
            rent = new JButton();
            jLabel1 = new JLabel();

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            setTitle("Wyszukiwanie edycja");

            car.setText("Samochody");
            car.addActionListener(new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    carActionPerformed(evt);
                }
            });

            customer.setText("Klienci");
            customer.addActionListener(new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    customerActionPerformed(evt);
                }
            });

            rent.setText("Wypożyczenia");
            rent.addActionListener(new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rentActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20));
            jLabel1.setText("Wyszukiwanie /dodawanie nowych / Edycja");

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(101, 101, 101)
                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(rent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(customer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(car, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(134, 134, 134)
                                                    .addComponent(jLabel1)))
                                    .addContainerGap(168, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel1)
                                    .addGap(62, 62, 62)
                                    .addComponent(car)
                                    .addGap(49, 49, 49)
                                    .addComponent(customer)
                                    .addGap(59, 59, 59)
                                    .addComponent(rent)
                                    .addContainerGap(99, Short.MAX_VALUE))
            );

            pack();
        }



        private void carActionPerformed(ActionEvent evt) {
            new SearchAll(new SearchLogic().allCarTable(), ToUpdateEdit.CAR).setVisible(true);

        }

        private void customerActionPerformed(ActionEvent evt) {
            new SearchAll(new SearchLogic().allCustomerTable(), ToUpdateEdit.CUSTOMER).setVisible(true);
        }

        private void rentActionPerformed(ActionEvent evt) {
            new SearchAll(new SearchLogic().allCarTable(), ToUpdateEdit.RENT).setVisible(true);
        }



    }


