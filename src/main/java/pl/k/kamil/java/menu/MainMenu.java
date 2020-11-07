package pl.k.kamil.java.menu;

import pl.k.kamil.java.logic.SearchLogic;
import pl.k.kamil.java.model.CarStatus;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    private JButton carReturn;
    private JLabel jLabelTitle;
    private JButton rent;
    private JButton searchEdit;

    public MainMenu() {
        initComponents();
    }

    private void initComponents() {

        rent = new JButton();
        carReturn = new JButton();
        searchEdit = new JButton();
        jLabelTitle = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setTitle("Wypożyczalnia samochodów");
        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle.setText("Wypożyczalnia samochodów");


        rent.setText("Nowe wypożyczenie");
        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });

        carReturn.setText("Zwrot");
        carReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carReturnActionPerformed(evt);
            }
        });

        searchEdit.setText("Edycja / Wyszukiwanie");
        searchEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEditActionPerformed(evt);
            }
        });



        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(searchEdit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(carReturn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(jLabelTitle)))
                                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabelTitle)
                                .addGap(62, 62, 62)
                                .addComponent(rent)
                                .addGap(49, 49, 49)
                                .addComponent(carReturn)
                                .addGap(59, 59, 59)
                                .addComponent(searchEdit)
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }



    private void rentActionPerformed(ActionEvent evt) {
       new RentMenu((new SearchLogic().allCarTableByStatus(CarStatus.FREE)), (new SearchLogic().allCustomerTable())).setVisible(true);
    }

    private void carReturnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchEditActionPerformed(ActionEvent evt) {
        new SearchMenu().setVisible(true);
    }


}
