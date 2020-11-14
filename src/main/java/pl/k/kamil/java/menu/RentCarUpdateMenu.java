package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.dao.RentDao;
import pl.k.kamil.java.logic.DateConvert;
import pl.k.kamil.java.logic.IsNumber;
import pl.k.kamil.java.logic.SearchLogic;
import pl.k.kamil.java.logic.ToUpdateEdit;
import pl.k.kamil.java.model.Car;
import pl.k.kamil.java.model.CarStatus;
import pl.k.kamil.java.model.Rent;

import javax.swing.*;
import java.math.BigDecimal;

public class RentCarUpdateMenu extends javax.swing.JFrame {

    private ButtonGroup buttonGroupCarStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonOk;
    private com.toedter.calendar.JDateChooser jDateChooserRentDate;
    private com.toedter.calendar.JDateChooser jDateChooserReturnDate;
    private com.toedter.calendar.JDateChooser jDateChooserRealReturnDate;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabelCar;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelCarStatus;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCustomerID;
    private javax.swing.JLabel jLabelDateRentCar;
    private javax.swing.JLabel jLabelDateReturnCar;
    private javax.swing.JLabel jLabelRentPrice;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMark;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelNouseNumber;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRealDateReturnCar;
    private javax.swing.JLabel jLabelRegNumber;
    private javax.swing.JLabel jLabelRentBy;
    private javax.swing.JLabel jLabelRepairFee;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelTotalPrice;
    private javax.swing.JRadioButton jRadioButtonCarStatusDAMAGED;
    private javax.swing.JRadioButton jRadioButtonCarStatusFree;
    private javax.swing.JTextField jTextFieldRentPrice;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldAdditionalCost;
    private javax.swing.JTextField jTextFieldTotalPrice;
    private javax.swing.JTextField tCity;
    private javax.swing.JTextField tColor;
    private javax.swing.JTextField tFirstName;
    private javax.swing.JTextField tHouseNumber;
    private javax.swing.JTextField tLastName;
    private javax.swing.JTextField tMark;
    private javax.swing.JTextField tModel;
    private javax.swing.JTextField tPostalCode;
    private javax.swing.JTextField tPrice;
    private javax.swing.JTextField tRegNumber;
    private javax.swing.JTextField tStreet;
    private BigDecimal additionalCost;
    private BigDecimal rentPrice;
    private BigDecimal totalPrice;
    private CarStatus carStatus;


    public RentCarUpdateMenu(Rent rent) {
        initComponents(rent);
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentCarUpdateMenu((Rent) new RentDao().findById(2)).setVisible(true);
            }
        });
    }

    private void initComponents(Rent rent) {

        buttonGroupCarStatus = new ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCar = new javax.swing.JLabel();
        jLabelRegNumber = new javax.swing.JLabel();
        jLabelMark = new javax.swing.JLabel();
        jLabelModel = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        tPrice = new javax.swing.JTextField();
        tColor = new javax.swing.JTextField();
        tModel = new javax.swing.JTextField();
        tMark = new javax.swing.JTextField();
        tRegNumber = new javax.swing.JTextField();
        jLabelRentBy = new javax.swing.JLabel();
        jLabelCustomerID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelStreet = new javax.swing.JLabel();
        jLabelNouseNumber = new javax.swing.JLabel();
        jLabelPostalCode = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        tCity = new javax.swing.JTextField();
        tPostalCode = new javax.swing.JTextField();
        tHouseNumber = new javax.swing.JTextField();
        tStreet = new javax.swing.JTextField();
        tLastName = new javax.swing.JTextField();
        tFirstName = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jDateChooserRealReturnDate = new com.toedter.calendar.JDateChooser();
        jLabelRealDateReturnCar = new javax.swing.JLabel();
        jLabelCarStatus = new javax.swing.JLabel();
        jLabelRentPrice = new javax.swing.JLabel();
        jTextFieldRentPrice = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabelRepairFee = new javax.swing.JLabel();
        jTextFieldAdditionalCost = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabelTotalPrice = new javax.swing.JLabel();
        jTextFieldTotalPrice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabelDateRentCar = new javax.swing.JLabel();
        jLabelDateReturnCar = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jDateChooserRentDate = new com.toedter.calendar.JDateChooser();
        jDateChooserReturnDate = new com.toedter.calendar.JDateChooser();
        jRadioButtonCarStatusFree = new javax.swing.JRadioButton();
        jRadioButtonCarStatusDAMAGED = new javax.swing.JRadioButton();

        jRadioButtonCarStatusFree.setSelected(true);
        buttonGroupCarStatus.add(jRadioButtonCarStatusFree);
        buttonGroupCarStatus.add(jRadioButtonCarStatusDAMAGED);
        carStatus=rent.getCar().getCarStatus();
        if (carStatus==CarStatus.FREE){
            jRadioButtonCarStatusFree.setSelected(true);
             }else {
            jRadioButtonCarStatusDAMAGED.setSelected(true);}

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitle.setText("Aktualizacja wypożyczenia ID:"+rent.getRentId());

        jLabelCar.setText("Samochód");

        jLabelRegNumber.setText("Numer rejestracyjny:");


        jLabelMark.setText("Marka :");

        jLabelModel.setText("Model:");

        jLabelColor.setText("Kolor:");

        jLabelPrice.setText("Cena za dzień: ");



        jLabelRentBy.setText("Wypożyczony przez:");

        jLabelCustomerID.setText("ID :");

        jLabelFirstName.setText("Imię:");

        jLabelLastName.setText("Nazwisko:");

        jLabelStreet.setText("Ulica:");

        jLabelNouseNumber.setText("Numer domu:");

        jLabelPostalCode.setText("Kod pocztowy:");

        jLabelCity.setText("Miasto:");



        jLabelRealDateReturnCar.setText("Realna data zwrotu: ");

        jLabelCarStatus.setText("Stan samochodu :");

        jLabelRentPrice.setText("Koszt wynajmu:");
        rentPrice = rent.getPrice();


        jTextFieldRentPrice.setText(String.valueOf(rent.getPrice()));


        jLabel19.setText("zł");

        jLabelRepairFee.setText("Opłaty dodatkowe:");

        jTextFieldAdditionalCost.setText(String.valueOf(rent.getAdditionalCost()));
        additionalCost = rent.getAdditionalCost();

        jTextFieldAdditionalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdditionalCostActionPerformed(evt);
            }
        });

        jLabel21.setText("zł");

        jLabelTotalPrice.setText("Całkowity koszt wynajmu:");

        jTextFieldTotalPrice.setText(String.valueOf(rent.getTotalPrice()));
        totalPrice=rent.getTotalPrice();

        jLabel23.setText("zł");

        jLabelDateRentCar.setText("Data wynajęcia:");

        jLabelDateReturnCar.setText("Przewidywana data zwrotu:");

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(evt -> jButtonOkActionPerformed(rent));


        jRadioButtonCarStatusFree.setText("Sprawny");
        jRadioButtonCarStatusFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCarStatusFreeActionPerformed(evt);
            }
        });

        jRadioButtonCarStatusDAMAGED.setText("Uszkodzony");
        jRadioButtonCarStatusDAMAGED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCarStatusDAMAGEDActionPerformed(evt);
            }
        });


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
         jTextFieldRentPrice.setEditable(false);
        jTextFieldTotalPrice.setEditable(false);



        //jLabelCarID.setText(rent.getCar().getRegNumber());
        tPrice.setText(String.valueOf(rent.getCar().getPrice()));
        tColor.setText(rent.getCar().getColor());
        tModel.setText(rent.getCar().getModel());
        tMark.setText(rent.getCar().getMark());
        tRegNumber.setText(rent.getCar().getRegNumber());
        tCity.setText(rent.getCustomer().getCity());
        tPostalCode.setText(rent.getCustomer().getPostalCode());
        tHouseNumber.setText(rent.getCustomer().getHouseNumber());
        tStreet.setText(rent.getCustomer().getStreet());
        tLastName.setText(rent.getCustomer().getLastName());
        tFirstName.setText(rent.getCustomer().getFirstName());
        jTextFieldID.setText(String.valueOf(rent.getCustomer().getId()));

        jDateChooserRentDate.setDateFormatString("yyyy-MM-dd");
        jDateChooserRealReturnDate.setDateFormatString("yyyy-MM-dd");
        jDateChooserReturnDate.setDateFormatString("yyyy-MM-dd");

        jDateChooserRentDate.setDate(DateConvert.convertToDate(rent.getRentDate()));
        jDateChooserReturnDate.setDate(DateConvert.convertToDate(rent.getReturnDate()));
        jDateChooserRealReturnDate.setDate(DateConvert.convertToDate(rent.getRealReturnDate()));






        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCar)
                                        .addComponent(jLabelRentBy)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelMark)
                                                        .addComponent(jLabelRegNumber)
                                                        .addComponent(jLabelModel)
                                                        .addComponent(jLabelColor)
                                                        .addComponent(jLabelPrice)
                                                        .addComponent(jLabelCustomerID)
                                                        .addComponent(jLabelFirstName)
                                                        .addComponent(jLabelLastName)
                                                        .addComponent(jLabelStreet)
                                                        .addComponent(jLabelNouseNumber)
                                                        .addComponent(jLabelPostalCode)
                                                        .addComponent(jLabelCity)
                                                        .addComponent(jLabelDateRentCar)
                                                        .addComponent(jLabelDateReturnCar)
                                                        .addComponent(jLabelRealDateReturnCar)
                                                        .addComponent(jLabelRentPrice)
                                                        .addComponent(jLabelCarStatus)
                                                        .addComponent(jLabelRepairFee)
                                                        .addComponent(jLabelTotalPrice))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldAdditionalCost, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 147, Short.MAX_VALUE)
                                                                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(50, 50, 50))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel21)
                                                                        .addComponent(jLabel23))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tFirstName)
                                                        .addComponent(tLastName)
                                                        .addComponent(tHouseNumber)
                                                        .addComponent(tPostalCode)
                                                        .addComponent(tCity)
                                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                        .addComponent(tRegNumber)
                                                        .addComponent(tMark)
                                                        .addComponent(tModel)
                                                        .addComponent(tColor)
                                                        .addComponent(tPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                        .addComponent(jDateChooserRealReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextFieldRentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel19))
                                                        .addComponent(jDateChooserReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jDateChooserRentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButtonCarStatusFree)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButtonCarStatusDAMAGED)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelTitle)
                                .addGap(51, 51, 51)
                                .addComponent(jLabelCar)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelRegNumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMark)
                                        .addComponent(tMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelModel)
                                        .addComponent(tModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelColor)
                                        .addComponent(tColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPrice)
                                        .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRentBy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCustomerID)
                                                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelFirstName)
                                                                        .addComponent(tFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelLastName)
                                                                        .addComponent(tLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelStreet)
                                                                        .addComponent(tStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(1, 1, 1)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelNouseNumber)
                                                                        .addComponent(tHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelPostalCode)
                                                                        .addComponent(tPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCity)
                                                                        .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                                                .addComponent(jLabelDateRentCar))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jDateChooserRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelDateReturnCar))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jDateChooserReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelRealDateReturnCar, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jDateChooserRealReturnDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelRentPrice)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextFieldRentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel19)))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCarStatus)
                                        .addComponent(jRadioButtonCarStatusFree)
                                        .addComponent(jRadioButtonCarStatusDAMAGED))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelRepairFee)
                                        .addComponent(jTextFieldAdditionalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTotalPrice)
                                        .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOk)
                                .addGap(32, 32, 32))
        );

        pack();
    }

    private void jTextFieldAdditionalCostActionPerformed(java.awt.event.ActionEvent evt) {
        if (!IsNumber.isNumeric(jTextFieldAdditionalCost.getText())) {
            JOptionPane.showMessageDialog(this, "Pole Dodatkowy koszt nie jest cyfrą", "Uwaga", JOptionPane.WARNING_MESSAGE);
        } else {
            additionalCost = BigDecimal.valueOf(Double.parseDouble(jTextFieldAdditionalCost.getText()));
            totalPrice = rentPrice.add(additionalCost);
            jTextFieldTotalPrice.setText(String.valueOf(totalPrice));

        }
    }

    private void jRadioButtonCarStatusDAMAGEDActionPerformed(java.awt.event.ActionEvent evt) {
        carStatus = CarStatus.DAMAGED;

    }

    private void jRadioButtonCarStatusFreeActionPerformed(java.awt.event.ActionEvent evt) {

        carStatus = CarStatus.FREE;
    }

    private void jButtonOkActionPerformed(Rent rent) {



        if (jDateChooserRentDate.getDate() == null || jDateChooserRealReturnDate.getDate() == null || jDateChooserReturnDate.getDate() == null ||
                DateConvert.convertToLocalDate(jDateChooserRealReturnDate.getDate()).compareTo(DateConvert.convertToLocalDate(jDateChooserRentDate.getDate())) < 0 ||
                DateConvert.convertToLocalDate(jDateChooserReturnDate.getDate()).compareTo(DateConvert.convertToLocalDate(jDateChooserRentDate.getDate())) < 0) {
            JOptionPane.showMessageDialog(this, "Daty są niepoprawne", "Uwaga", JOptionPane.WARNING_MESSAGE);
        } else {
            Car car = rent.getCar();
            rent.setTotalPrice(totalPrice);
            rent.setRealReturnDate(DateConvert.convertToLocalDate(jDateChooserRealReturnDate.getDate()));
            rent.setRentDate(DateConvert.convertToLocalDate(jDateChooserRentDate.getDate()));
            rent.setReturnDate(DateConvert.convertToLocalDate(jDateChooserReturnDate.getDate()));
            rent.setAdditionalCost(additionalCost);
            car.setCarStatus(carStatus);
            JOptionPane.showMessageDialog(this, "Zaktualizowano Wypożyczenie ID:"+rent.getRentId(),"Aktualizacja",JOptionPane.INFORMATION_MESSAGE);
            new RentDao().update(rent);
            new CarDao().update(car);
            this.dispose();
            new SearchAll(new SearchLogic().allRentTable(), ToUpdateEdit.RENT).setVisible(true);
        }
    }
}
