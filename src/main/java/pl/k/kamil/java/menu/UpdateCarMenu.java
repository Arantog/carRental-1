package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CarDao;
import pl.k.kamil.java.logic.IsNumber;
import pl.k.kamil.java.model.Car;
import pl.k.kamil.java.model.CarStatus;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class UpdateCarMenu extends JFrame {

    private JTextField jTextFieldColor;
    private JTextField jTextFieldMark;
    private JTextField jTextFieldModel;
    private JTextField jTextFieldPrice;
    private JTextField jTextFieldRegNumber;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JRadioButton jRadioButtonDAMAGED;
    private javax.swing.JRadioButton jRadioButtonFREE;
    private javax.swing.JRadioButton jRadioButtonRENTED;
    private javax.swing.JLabel jLabel1;

    public UpdateCarMenu(Car car) {
        initComponents(car);
    }

    private void initComponents(Car car) {
        buttonGroupStatus = new javax.swing.ButtonGroup();
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
        jRadioButtonFREE = new javax.swing.JRadioButton();
        jRadioButtonDAMAGED = new javax.swing.JRadioButton();
        jRadioButtonRENTED = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();


        jLabelRegNumber.setText("Numer rejestracyjny : ");
        jLabelMark.setText("Marka:");
        jLabelTitle.setFont(new Font("Tahoma", 0, 20));
        jLabelTitle.setText("Uaktualnij samochód:");
        jLabelModel.setText("Model:");
        jLabelColor.setText("Kolor:");
        jLabelPrice.setText("Cena za dzień:");
        jButtonAdd.setText("Uaktualnij");
        jLabelCurrency.setText("zł");
        jButtonAdd.addActionListener(evt -> jButton1ActionPerformed(car));



        jTextFieldRegNumber.setText(car.getRegNumber());
        jTextFieldRegNumber.setEditable(false);
        jTextFieldMark.setText(car.getMark());
        jTextFieldModel.setText(car.getModel());
        jTextFieldColor.setText(car.getColor());
        jTextFieldPrice.setText(String.valueOf(car.getPrice()));
        jLabel1.setText("Stan:");


        jRadioButtonFREE.setText("Wolny");
        jRadioButtonFREE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car.setCarStatus(CarStatus.FREE);
            }
        });

        jRadioButtonDAMAGED.setText("Uszkodzony");
        jRadioButtonDAMAGED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car.setCarStatus(CarStatus.DAMAGED);

            }
        });

        jRadioButtonRENTED.setText("Wynajęty");


        buttonGroupStatus.add(jRadioButtonFREE);
        buttonGroupStatus.add(jRadioButtonDAMAGED);
        buttonGroupStatus.add(jRadioButtonRENTED);


        switch (car.getCarStatus()) {
            case FREE:
                jRadioButtonFREE.setSelected(true);
                jRadioButtonRENTED.setEnabled(false);
                break;
            case DAMAGED:
                jRadioButtonRENTED.setEnabled(false);
                jRadioButtonDAMAGED.setSelected(true);;
                break;
            case RENTED:
                jRadioButtonFREE.setEnabled(false);
                jRadioButtonDAMAGED.setEnabled(false);
                jRadioButtonRENTED.setSelected(true);
                break;
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAdd)
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
                                                        .addComponent(jLabelPrice)
                                                        .addComponent(jLabel1))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabelCurrency))
                                                        .addComponent(jTextFieldMark, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jRadioButtonFREE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButtonDAMAGED)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButtonRENTED)))))
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
                                        .addComponent(jLabelCurrency))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jRadioButtonFREE)
                                        .addComponent(jRadioButtonDAMAGED)
                                        .addComponent(jRadioButtonRENTED))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jButtonAdd)
                                .addGap(36, 36, 36))
        );

        pack();
    }

    private void jButton1ActionPerformed(Car car) {


        if (jTextFieldRegNumber.getText().equals("") || jTextFieldMark.getText().equals("") || jTextFieldModel.getText().equals("") || jTextFieldColor.getText().equals("") || jTextFieldPrice.getText().equals("")) {
            new ErrorMenu().emptyJTextField();
        } else if (!IsNumber.isNumeric(jTextFieldPrice.getText())) {
            new ErrorMenu().priceIsNotDigit(jTextFieldPrice.getText());
        } else {
                car.setModel(jTextFieldModel.getText());
                car.setMark(jTextFieldMark.getText());
                car.setColor(jTextFieldColor.getText());
                car.setPrice(BigDecimal.valueOf(Double.parseDouble(jTextFieldPrice.getText())));

            try {
                new CarDao().update(car);
                JOptionPane.showMessageDialog(this, "Uaktualniono samochód :\n" + jTextFieldRegNumber.getText() + " " + jTextFieldMark.getText(),"Uaktualniono samochód", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (PersistenceException e) {
                JOptionPane.showMessageDialog(this, "Samochód już istnieje", "Uwaga", JOptionPane.ERROR_MESSAGE);
            }


        }

    }


}
