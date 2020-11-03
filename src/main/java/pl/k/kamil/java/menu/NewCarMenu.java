package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.model.Car;
import pl.k.kamil.java.model.CarStatus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

public class NewCarMenu extends JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelMark;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRegNumber;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldMark;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldRegNumber;

    public NewCarMenu() {
        initComponents();
    }
    private void initComponents() {

        jLabelRegNumber = new javax.swing.JLabel();
        jLabelMark = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelModel = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldRegNumber = new javax.swing.JTextField();
        jTextFieldMark = new javax.swing.JTextField();
        jTextFieldModel = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();


        jLabelRegNumber.setText("Numer rejestracyjny : ");

        jLabelMark.setText("Marka:");

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTitle.setText("Nowy samochód:");

        jLabelModel.setText("Model:");

        jLabelColor.setText("Kolor:");

        jLabelPrice.setText("Cena za dzień:");

        jButton1.setText("Dodaj");

         jButton1.addActionListener(this::jButton1ActionPerformed);


        jLabel6.setText("zł");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(201, 201, 201))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(199, 199, 199)
                                                .addComponent(jLabelTitle))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelMark)
                                                        .addComponent(jLabelRegNumber)
                                                        .addComponent(jLabelModel)
                                                        .addComponent(jLabelColor)
                                                        .addComponent(jLabelPrice))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel6))
                                                        .addComponent(jTextFieldMark, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabelTitle)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelRegNumber)
                                        .addComponent(jTextFieldRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMark)
                                        .addComponent(jTextFieldMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelModel)
                                        .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelColor)
                                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPrice)
                                        .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(36, 36, 36))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if ( jTextFieldRegNumber.getText().equals("") || jTextFieldMark.getText().equals("") || jTextFieldModel.getText().equals("") || jTextFieldColor.getText().equals("") ||jTextFieldPrice.getText().equals("") ) {
                    new ErrorMenu().emptyJTextField();
                }  else if (!jTextFieldPrice.getText().chars().allMatch(Character::isDigit)){
                    new ErrorMenu().priceIsNotDigit(jTextFieldPrice.getText());
                }else {
                    new CarDao().add(new Car(jTextFieldRegNumber.getText(), jTextFieldMark.getText(), jTextFieldModel.getText(), jTextFieldColor.getText(), BigDecimal.valueOf(Long.parseLong(jTextFieldPrice.getText())), CarStatus.FREE));
                    JOptionPane.showMessageDialog(this, "Dodano samochód :\n" + jTextFieldRegNumber.getText() + " " + jTextFieldMark.getText());
                    this.dispose();

                }

    }



}