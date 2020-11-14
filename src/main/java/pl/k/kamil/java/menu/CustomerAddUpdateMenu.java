package pl.k.kamil.java.menu;

import pl.k.kamil.java.dao.CustomerDao;
import pl.k.kamil.java.logic.SearchLogic;
import pl.k.kamil.java.logic.SearchMenuFunction;
import pl.k.kamil.java.logic.ToUpdateEdit;
import pl.k.kamil.java.model.Customer;

import javax.swing.*;
import java.util.List;

public class CustomerAddUpdateMenu extends javax.swing.JFrame {



    private javax.swing.JButton jButtonAction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelHouseNumber;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JTextField jTextFieldStreet;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldHouseNumber;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPostalCode;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JTextField jTextFieldID;




    public CustomerAddUpdateMenu(SearchMenuFunction searchMenuFunction) {
        initComponents(searchMenuFunction,new Customer());
    }

    public CustomerAddUpdateMenu(SearchMenuFunction searchMenuFunction, Customer customer) {
        initComponents(searchMenuFunction,customer);
    }



    private void initComponents(SearchMenuFunction searchMenuFunction,Customer customer) {



        jLabel1 = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelStreet = new javax.swing.JLabel();
        jLabelHouseNumber = new javax.swing.JLabel();
        jLabelPostalCode = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldStreet = new javax.swing.JTextField();
        jTextFieldHouseNumber = new javax.swing.JTextField();
        jTextFieldPostalCode = new javax.swing.JTextField();
        jTextFieldCity = new javax.swing.JTextField();
        jButtonAction = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelFirstName.setText("Imię:");
        jLabelLastName.setText("Nazwisko:");
        jLabelStreet.setText("Ulica:");
        jLabelHouseNumber.setText("Numer domu:");
        jLabelPostalCode.setText("Kod pocztowy:");
        jLabelCity.setText("Miasto:");
        jLabelID.setVisible(false);
        jTextFieldID.setVisible(false);






           jButtonAction.addActionListener(evt ->jButtonActionActionPerformed(searchMenuFunction,customer));




        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAction)
                                .addGap(90, 90, 90))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(115, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelFirstName)
                                        .addComponent(jLabelLastName)
                                        .addComponent(jLabelStreet)
                                        .addComponent(jLabelHouseNumber)
                                        .addComponent(jLabelPostalCode)
                                        .addComponent(jLabelCity)
                                        .addComponent(jLabelID))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCity)
                                        .addComponent(jTextFieldLastName)
                                        .addComponent(jTextFieldStreet)
                                        .addComponent(jTextFieldHouseNumber)
                                        .addComponent(jTextFieldPostalCode)
                                        .addComponent(jTextFieldFirstName)
                                        .addComponent(jTextFieldID))
                                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelID)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFirstName)
                                        .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelLastName)
                                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelStreet)
                                        .addComponent(jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHouseNumber)
                                        .addComponent(jTextFieldHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPostalCode)
                                        .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCity)
                                        .addComponent(jTextFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(jButtonAction)
                                .addGap(26, 26, 26))
        );

        pack();

        switch (searchMenuFunction) {
            case ADD:
                jLabel1.setText("Dodaj klienta");
                jButtonAction.setText("Dodaj");
                break;
            case EDIT:
                jLabelID.setVisible(true);
                jLabelID.setText("ID:");
                jTextFieldID.setVisible(true);
                jTextFieldID.setText(String.valueOf(customer.getId()));
                jTextFieldID.setEditable(false);
                jTextFieldFirstName.setText(customer.getFirstName());
                jTextFieldLastName.setText(customer.getLastName());
                jTextFieldStreet.setText(customer.getStreet());
                jTextFieldHouseNumber.setText(customer.getHouseNumber());
                jTextFieldPostalCode.setText(customer.getPostalCode());
                jTextFieldCity.setText(customer.getCity());

                jLabel1.setText("Uaktualnij klienta");
                jButtonAction.setText("Uaktualnij");
                break;
            case SEARCH:
                jLabel1.setText("Wyszukaj klienta");
                jButtonAction.setText("Wyszukaj");
                break;
    }



}

    private void jButtonActionActionPerformed(SearchMenuFunction searchMenuFunction,Customer customer) {
        switch (searchMenuFunction) {
            case ADD:
                if (jTextFieldFirstName.getText().equals("") || jTextFieldLastName.getText().equals("") || jTextFieldStreet.getText().equals("") || jTextFieldCity.getText().equals("") || jTextFieldHouseNumber.getText().equals("") || jTextFieldPostalCode.getText().equals("")) {
                    new ErrorMenu().emptyJTextField();
                } else {
                    new CustomerDao().add(new Customer(jTextFieldFirstName.getText(), jTextFieldLastName.getText(), jTextFieldStreet.getText(),
                            jTextFieldHouseNumber.getText(), jTextFieldCity.getText(), jTextFieldPostalCode.getText()));
                    JOptionPane.showMessageDialog(this, "Dodano :" + jTextFieldFirstName.getText() + " " + jTextFieldLastName.getText());
                    this.dispose();
                    new SearchAll(new SearchLogic().allCustomerTable(), ToUpdateEdit.CUSTOMER).setVisible(true);
                };
                break;
            case EDIT:
                if (jTextFieldFirstName.getText().equals("") || jTextFieldLastName.getText().equals("") || jTextFieldStreet.getText().equals("") || jTextFieldCity.getText().equals("") || jTextFieldHouseNumber.getText().equals("") || jTextFieldPostalCode.getText().equals("")) {
                    new ErrorMenu().emptyJTextField();
                } else {
                    customer.setFirstName(jTextFieldFirstName.getText());
                    customer.setLastName(jTextFieldLastName.getText());
                    customer.setStreet(jTextFieldStreet.getText());
                    customer.setHouseNumber(jTextFieldHouseNumber.getText());
                    customer.setCity(jTextFieldCity.getText());
                    customer.setPostalCode(jTextFieldPostalCode.getText());
                    new CustomerDao().update(customer);
                    JOptionPane.showMessageDialog(this, "Uaktualniono klienta :\n" + jTextFieldFirstName.getText() + " " + jTextFieldLastName.getText(),"Aktualizacja", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new SearchAll(new SearchLogic().allCustomerTable(), ToUpdateEdit.CUSTOMER).setVisible(true);
                }


                break;
            case SEARCH:

                List<Customer> customers = new CustomerDao().findCustomerByAll(0,"*","*","*","*","*","*");
                System.out.println(customers);
                new SearchAll(new SearchLogic().allCustomerListTable(customers), ToUpdateEdit.CUSTOMER).setVisible(true);

                break;
        }

    }
    }