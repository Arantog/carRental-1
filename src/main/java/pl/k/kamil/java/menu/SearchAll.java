package pl.k.kamil.java.menu;


import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.logic.SearchLogic;
import pl.k.kamil.java.logic.ToUpdateEdit;

import javax.swing.*;
import javax.swing.table.TableModel;


public class SearchAll extends JFrame {

    private JTable jTable1;
    private int SelectedRows;
    private javax.swing.JButton jButtonRefresh;


    public SearchAll(TableModel tableModel, ToUpdateEdit toUpdateEdit) {
        initComponents(tableModel, toUpdateEdit);
    }


    private void initComponents(TableModel tableModel, ToUpdateEdit toUpdateEdit) {

        JScrollPane jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        JButton jButtonEdit = new JButton();
        JButton jButtonDelete = new JButton();
        JButton jButtonAdd = new JButton();
        jButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(tableModel);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        SelectedRows =jTable1.getSelectedRow();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wyszukiwanie / Edycja");

        jButtonRefresh.setText("Odśwież");
        jButtonRefresh.addActionListener(evt ->jButtonRefreshActionPerformed(toUpdateEdit));


        jTable1.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jButtonEdit.setText("Zmień zaznaczony");
        jButtonEdit.addActionListener(evt -> jButtonEditActionPerformed(toUpdateEdit));

        jButtonDelete.setText("Usuń zaznaczony");
        jButtonDelete.addActionListener(evt -> jButtonDeleteActionPerformed(toUpdateEdit));

        jButtonAdd.setText("Dodaj nowy");
        jButtonAdd.addActionListener(evt -> jButtonAddActionPerformed(toUpdateEdit));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRefresh)
                                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(174, 174, 174)
                                                .addComponent(jButtonEdit)
                                                .addGap(102, 102, 102)
                                                .addComponent(jButtonDelete)
                                                .addGap(95, 95, 95)
                                                .addComponent(jButtonAdd)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jButtonRefresh)
                                .addGap(30, 30, 30))
        );

        pack();
    }


    private void jButtonRefreshActionPerformed(ToUpdateEdit toUpdateEdit) {

        switch (toUpdateEdit) {
            case CAR:


                    jTable1.setModel(new SearchLogic().allCarTable());

                break;

            case CUSTOMER:
                   jTable1.setModel(new SearchLogic().allCustomerTable());

                break;

            case RENT:
//
//                    jTable1.setModel(new SearchLogic().allRentTable());
                break;


        }
        jTable1.repaint();
    }


    private void jButtonDeleteActionPerformed(ToUpdateEdit toUpdateEdit) {

        switch (toUpdateEdit) {
            case CAR:

                int carOptionsPane=JOptionPane.showConfirmDialog(this,"Czy napewno chcesz usunąć samochód \n o numerze rejestracyjnym :"+(String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                if(carOptionsPane==JOptionPane.YES_OPTION){
                    new CarDao().deleteCarById((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                jTable1.setModel(new SearchLogic().allCarTable());}
                System.out.println(toUpdateEdit);
                break;

            case CUSTOMER:
                int customerOptionsPane =JOptionPane.showConfirmDialog(this,"Czy napewno chcesz usunąć klienta:\n"
                        +(String) jTable1.getValueAt(jTable1.getSelectedRow(), 0) +". "
                        +jTable1.getValueAt(jTable1.getSelectedRow(), 1)+" "
                        +jTable1.getValueAt(jTable1.getSelectedRow(), 2) );

                if(customerOptionsPane ==JOptionPane.YES_OPTION){



                    new CustomerDao().deleteById(Integer.parseInt((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                jTable1.setModel(new SearchLogic().allCustomerTable());}

                break;

            case RENT:
//                int rentOptionsPane =JOptionPane.showConfirmDialog(this,"Czy napewno chcesz usunąć wypożyczenie samochodu:\n o numerze rejestracyjnym :"
//                        +(String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
//
//                if(rentOptionsPane ==JOptionPane.YES_OPTION){
//                    new RentDao().deleteById((Integer) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
//                    jTable1.setModel(new SearchLogic().allRentTable());}
                break;


        }
        jTable1.repaint();
    }

    private void jButtonEditActionPerformed(ToUpdateEdit toUpdateEdit) {

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

    private void jButtonAddActionPerformed(ToUpdateEdit toUpdateEdit) {

        switch (toUpdateEdit) {
            case CAR:
                new NewCarMenu().setVisible(true);
                System.out.println("Zrobione");
                jTable1.setModel(new SearchLogic().allCarTable());
                break;
            case CUSTOMER:
                new NewCustomerMenu();
                jTable1.setModel(new SearchLogic().allCustomerTable());
                break;

            case RENT:
                System.out.println(toUpdateEdit);
                break;


        }
        jTable1.repaint();
    }




}
