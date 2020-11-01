package pl.k.kamil.java.menu;

import pl.k.kamil.java.logic.SearchLogic;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RentMenu extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private int carSelectedRows;
    private int customerSelectedRows;

    private com.toedter.calendar.JDateChooser jDateRentCar;
    private com.toedter.calendar.JDateChooser jDateReturnCar;
    private JTable carTable;
    private JTable customerTabale;
    private JTextField tPrice;
    private JTextField tCity;
    private JTextField tColor;
    private JTextField tFirstName;
    private JTextField tHouseNumber;
    private JTextField tLastName;
    private JTextField tMark;
    private JTextField tModel;
    private JTextField tPostalCode;
    private JTextField tRegNumber;
    private JTextField tStreet;
    private JTextField tTotalPrice;
    private JTextField jTextFieldID;




    public RentMenu(TableModel carTableModel, TableModel customerTableModel) {
        initComponents(carTableModel, customerTableModel);
    }

    public static void main(String args[]) {

        new RentMenu((new SearchLogic().allCarTable()), (new SearchLogic().allCustomerTable())).setVisible(true);
    }


    private void initComponents(TableModel carTableModel, TableModel customerTableModel) {
        System.out.println(carTableModel.getColumnName(0));
        System.out.println(carTableModel.getValueAt(0, 0));

        JScrollPane carScrollPane = new JScrollPane();
        carTable = new JTable();
        JScrollPane customerScrollPane2 = new JScrollPane();
        customerTabale = new JTable();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        tRegNumber = new JTextField();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel18 = new JLabel();
        JLabel jLabel19 = new JLabel();
        JButton jButton1 = new JButton();
        JLabel jLabelCusotmerID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        tMark = new JTextField();
        tModel = new JTextField();
        tColor = new JTextField();
        tPrice = new JTextField();
        tFirstName = new JTextField();
        tLastName = new JTextField();
        tStreet = new JTextField();
        tHouseNumber = new JTextField();
        tPostalCode = new JTextField();
        tCity = new JTextField();
        tTotalPrice = new JTextField();
        JLabel jLabel20 = new JLabel();
        JButton jButton2 = new JButton();
        jDateRentCar = new com.toedter.calendar.JDateChooser();
        jDateReturnCar = new com.toedter.calendar.JDateChooser();


        jTextFieldID.setEditable(false);
        tFirstName.setEditable(false);
        tLastName.setEditable(false);
        tStreet.setEditable(false);
        tHouseNumber.setEditable(false);
        tPostalCode.setEditable(false);
        tCity.setEditable(false);

        tRegNumber.setEditable(false);
        tMark.setEditable(false);
        tModel.setEditable(false);
        tColor.setEditable(false);
        tPrice.setEditable(false);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nowe wypożyczenie");


        carTable.setModel(carTableModel);
        carScrollPane.setViewportView(carTable);
        ListSelectionModel selectcar = carTable.getSelectionModel();
        selectcar.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                carTableSelectedActionPerformed(carTableModel);
            }
        });


        customerTabale.setModel(customerTableModel);
        customerScrollPane2.setViewportView(customerTabale);
        customerTabale.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                customerTableSelectedActionPerformed(customerTableModel);


            }
        });

        jLabel1.setText("Wybierz samochód");

        jLabel2.setText("Wybierz klienta");

        jLabel3.setFont(new Font("Tahoma", 0, 18));
        jLabel3.setText("Nowe wypożyczenie");

        jLabel4.setText("Samochód");

        tTotalPrice.setText("");

        jLabel5.setText("Numer rejestracyjny:");

        jLabel6.setText("Marka :");

        jLabel7.setText("Model:");

        jLabel8.setText("Kolor:");

        jLabel9.setText("Cena za dzień: ");

        jLabel10.setText("Wypożyczony przez:");

        jLabel11.setText("Imię:");

        jLabel12.setText("Nazwisko:");

        jLabel13.setText("Ulica:");

        jLabel14.setText("Numer domu:");

        jLabel15.setText("Kod pocztowy:");

        jLabel16.setText("Miasto:");

        jLabel17.setText("Data wypożyczenia:");

        jLabel18.setText("Data zwrotu:");

        jLabel19.setText("cena za wypożyczenie:");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });



        jLabel20.setText("zł");

        jButton2.setText("Odśwież");



        jLabelCusotmerID.setText("ID :");



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel19)
                                                                                        .addComponent(jLabel17)
                                                                                        .addComponent(jLabel18))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(tTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel20)
                                                                                                .addGap(0, 81, Short.MAX_VALUE))
                                                                                        .addComponent(jDateRentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jDateReturnCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel11)
                                                                                        .addComponent(jLabel14)
                                                                                        .addComponent(jLabel15)
                                                                                        .addComponent(jLabel16)
                                                                                        .addComponent(jLabel12)
                                                                                        .addComponent(jLabel13)
                                                                                        .addComponent(jLabelCusotmerID))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(tFirstName)
                                                                                        .addComponent(tLastName)
                                                                                        .addComponent(tStreet)
                                                                                        .addComponent(tHouseNumber)
                                                                                        .addComponent(tPostalCode, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                                                        .addComponent(tCity)
                                                                                        .addComponent(jTextFieldID)))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel9))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(tRegNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                                        .addComponent(tMark)
                                                                        .addComponent(tModel)
                                                                        .addComponent(tColor)
                                                                        .addComponent(tPrice))))
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(carScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(customerScrollPane2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(419, 419, 419)
                                                .addComponent(jLabel1)
                                                .addGap(347, 347, 347)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(321, 321, 321)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel4)
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(tMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(tModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(tColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(carScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCusotmerID)
                                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(tLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel12)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15)
                                                        .addComponent(tPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel16)
                                                        .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(123, 123, 123)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDateReturnCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jDateRentCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel18))))
                                        .addComponent(customerScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(tTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(19, 19, 19))
        );



        pack();}// </editor-fold>//GEN-END:initComponents

    private void customerTableSelectedActionPerformed(TableModel customerTableModel) {
        customerSelectedRows =carTable.getSelectedRow();
        jTextFieldID.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 0));
        tFirstName.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 1));
        tLastName.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 2));
        tStreet.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 3));
        tHouseNumber.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 4));
        tPostalCode.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 5));
        tCity.setText((String) customerTableModel.getValueAt(customerTabale.getSelectedRow(), 6));
    }

    private void carTableSelectedActionPerformed(TableModel carTableModel) {
        carSelectedRows =carTable.getSelectedRow();
        tRegNumber.setText((String) carTableModel.getValueAt(carTable.getSelectedRow(), 0));
        tMark.setText((String) carTableModel.getValueAt(carTable.getSelectedRow(), 1));
        tModel.setText((String) carTableModel.getValueAt(carTable.getSelectedRow(), 2));
        tColor.setText((String) carTableModel.getValueAt(carTable.getSelectedRow(), 3));
        tPrice.setText((String) carTableModel.getValueAt(carTable.getSelectedRow(), 4));
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed







}
