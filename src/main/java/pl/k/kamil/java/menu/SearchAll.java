package pl.k.kamil.java.menu;


import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.logic.SearchLogic;
import pl.k.kamil.java.logic.ToUpdateEdit;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchAll extends JFrame {

    private JTable jTable1;


    public SearchAll(TableModel tableModel, ToUpdateEdit toUpdateEdit) {
        initComponents(tableModel, toUpdateEdit);
    }


    private void initComponents(TableModel tableModel, ToUpdateEdit toUpdateEdit) {

        JScrollPane jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        JButton jButtonEdit = new JButton();
        JButton jButtonDelete = new JButton();
        JButton jButtonAdd = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(tableModel);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);


        jTable1.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jButtonEdit.setText("Zmień zaznaczony");

        jButtonDelete.setText("Usuń zaznaczony");
        jButtonDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(toUpdateEdit);
            }
        });

        jButtonAdd.setText("Dodaj nowy");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonEdit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 677, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 897, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(174, 174, 174)
                                                .addComponent(jButtonEdit)
                                                .addGap(102, 102, 102)
                                                .addComponent(jButtonDelete)
                                                .addGap(95, 95, 95)
                                                .addComponent(jButtonAdd)))
                                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton2ActionPerformed(ToUpdateEdit toUpdateEdit) {

        switch (toUpdateEdit) {
            case CAR:
                new CarDao().deleteCarById("411");
                jTable1.setModel(new SearchLogic().allCarTable());
                System.out.println(toUpdateEdit);
                break;

            case CUSTOMER:
                new CustomerDao().deleteById(6);
                jTable1.setModel(new SearchLogic().allCustomerTable());

                break;

            case RENT:
                System.out.println(toUpdateEdit);
                break;


        }
        jTable1.repaint();
    }

}
