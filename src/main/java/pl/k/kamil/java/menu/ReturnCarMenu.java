package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.RentDao;
import pl.k.kamil.java.logic.SearchLogic;
import pl.k.kamil.java.model.Rent;
import pl.k.kamil.java.model.RentStatus;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

public class ReturnCarMenu extends javax.swing.JFrame {

    // Variables declaration - do not modify

    private javax.swing.ButtonGroup buttonGroupCarStatus;
    private javax.swing.JButton jButtonOk;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCarID;
    private javax.swing.JLabel jLabelCarStatus;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCusotmerID;
    private javax.swing.JLabel jLabelDateRentCar;
    private javax.swing.JLabel jLabelDateReturnCar;
    private javax.swing.JLabel jLabelDelayFee;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMark;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelHouseNumber;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRegNumber;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelTotalPrice;
    private javax.swing.JRadioButton jRadioButtonCarStatusDAMAGED;
    private javax.swing.JRadioButton jRadioButtonCarStatusFree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRentedCar;
    private javax.swing.JTextField jTextFieldDateRentCar;
    private javax.swing.JTextField jTextFieldDateReturnCar;
    private javax.swing.JTextField jTextFieldDelayFee;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldRepairFee;
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
    /**
     * Creates new form ReturnCarMenu
     */
    public ReturnCarMenu(TableModel rentTableModel) {
        initComponents(rentTableModel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnCarMenu(new SearchLogic().allRentTableByStatus(RentStatus.ONGOING)).setVisible(true);
            }
        });
    }


    private void initComponents(TableModel rentTableModel) {


        buttonGroupCarStatus = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRentedCar = new javax.swing.JTable();
        jLabelCarID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabelCusotmerID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelStreet = new javax.swing.JLabel();
        jLabelHouseNumber = new javax.swing.JLabel();
        jLabelPostalCode = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        tCity = new javax.swing.JTextField();
        tPostalCode = new javax.swing.JTextField();
        tHouseNumber = new javax.swing.JTextField();
        tStreet = new javax.swing.JTextField();
        tLastName = new javax.swing.JTextField();
        tFirstName = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabelCarStatus = new javax.swing.JLabel();
        jLabelDelayFee = new javax.swing.JLabel();
        jTextFieldDelayFee = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldRepairFee = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabelTotalPrice = new javax.swing.JLabel();
        jTextFieldTotalPrice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabelDateRentCar = new javax.swing.JLabel();
        jLabelDateReturnCar = new javax.swing.JLabel();
        jTextFieldDateRentCar = new javax.swing.JTextField();
        jTextFieldDateReturnCar = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonCarStatusFree = new javax.swing.JRadioButton();
        jRadioButtonCarStatusDAMAGED = new javax.swing.JRadioButton();
        jRadioButtonCarStatusFree.setSelected(true);
        buttonGroupCarStatus.add(jRadioButtonCarStatusFree);
        buttonGroupCarStatus.add(jRadioButtonCarStatusDAMAGED);

        jTableRentedCar.setModel(rentTableModel);
        jTableRentedCar.getTableHeader().setReorderingAllowed(false);
        if (jTableRentedCar.getColumnModel().getColumnCount() > 0) {
            jTableRentedCar.getColumnModel().getColumn(0).setPreferredWidth(30);
        }
        jScrollPane1.setViewportView(jTableRentedCar);
        jTableRentedCar.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                rentTableSelectedActionPerformed(rentTableModel);


            }
        });

        jLabelCarID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCarID.setText("Zwrot samochodu");

        jLabel4.setText("Samochód");

        jLabelRegNumber.setText("Numer rejestracyjny:");

        jLabelMark.setText("Marka :");

        jLabelModel.setText("Model:");

        jLabelColor.setText("Kolor:");

        jLabelPrice.setText("Cena za dzień: ");



        jLabel10.setText("Wypożyczony przez:");

        jLabelCusotmerID.setText("ID :");

        jLabelFirstName.setText("Imię:");

        jLabelLastName.setText("Nazwisko:");

        jLabelStreet.setText("Ulica:");

        jLabelHouseNumber.setText("Numer domu:");

        jLabelPostalCode.setText("Kod pocztowy:");

        jLabelCity.setText("Miasto:");



        jLabel1.setText("Wybierz samochód do zwrotu:");

        jLabel2.setText("Realna data zwrotu: ");

        jLabelCarStatus.setText("Stan samochodu :");

        jLabelDelayFee.setText("Opłata za opóźnienie:");

        jTextFieldDelayFee.setText("0");
        jTextFieldDelayFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDelayFeeActionPerformed(evt);
            }
        });

        jLabel19.setText("zł");

        jLabel20.setText("Koszty naprawy:");

        jTextFieldRepairFee.setText("0");
        jTextFieldRepairFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRepairFeeActionPerformed(evt);
            }
        });


        jLabel21.setText("zł");

        jLabelTotalPrice.setText("Całkowity koszt wynajmu:");

        jTextFieldTotalPrice.setText("jTextField2");

        jLabel23.setText("zł");

        jLabelDateRentCar.setText("Data wynajęcia:");

        jLabelDateReturnCar.setText("Przewidywana data zwrotu:");

        jTextFieldDateRentCar.setText("jTextField3");

        jTextFieldDateReturnCar.setText("jTextField4");

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Zwrot samochodu");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel10)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMark)
                                                                        .addComponent(jLabelRegNumber)
                                                                        .addComponent(jLabelModel)
                                                                        .addComponent(jLabelColor)
                                                                        .addComponent(jLabelPrice)
                                                                        .addComponent(jLabelCusotmerID)
                                                                        .addComponent(jLabelFirstName)
                                                                        .addComponent(jLabelLastName)
                                                                        .addComponent(jLabelStreet)
                                                                        .addComponent(jLabelHouseNumber)
                                                                        .addComponent(jLabelPostalCode)
                                                                        .addComponent(jLabelCity)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabelCarStatus)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jLabelDateRentCar)
                                                        .addComponent(jLabelTotalPrice)
                                                        .addComponent(jLabelDelayFee)
                                                        .addComponent(jLabelDateReturnCar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(tStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jTextFieldDelayFee, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel19))
                                                                .addComponent(jTextFieldDateReturnCar, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                                .addComponent(jTextFieldDateRentCar)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                                        .addComponent(jTextFieldRepairFee, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel21)
                                                                        .addComponent(jLabel23)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jRadioButtonCarStatusFree)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jRadioButtonCarStatusDAMAGED)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabelCarID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(662, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(jLabel4)
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
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCusotmerID)
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
                                                        .addComponent(jLabelHouseNumber)
                                                        .addComponent(tHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelPostalCode)
                                                        .addComponent(tPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCity)
                                                        .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelDateRentCar)
                                                        .addComponent(jTextFieldDateRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelDateReturnCar)
                                                        .addComponent(jTextFieldDateReturnCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(31, Short.MAX_VALUE)
                                                .addComponent(jLabelCarID)
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelDelayFee)
                                        .addComponent(jTextFieldDelayFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCarStatus)
                                        .addComponent(jRadioButtonCarStatusFree)
                                        .addComponent(jRadioButtonCarStatusDAMAGED))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jTextFieldRepairFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTotalPrice)
                                        .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonOk)
                                .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel5)
                                        .addContainerGap(721, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>
    private void rentTableSelectedActionPerformed(TableModel rentTableModel) {
        Rent rent = (Rent) new RentDao().findById(Integer.parseInt((String) rentTableModel.getValueAt(jTableRentedCar.getSelectedRow(), 0)));
        jLabelCarID.setText(rent.getCar().getRegNumber());
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
        jTextFieldDateRentCar.setText(String.valueOf(rent.getRentDate()));
        jTextFieldDateReturnCar.setText(String.valueOf(rent.getReturnDate()));

    }

    private void jTextFieldDelayFeeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldRepairFeeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonCarStatusDAMAGEDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButtonCarStatusFreeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
// End of variables declaration
}