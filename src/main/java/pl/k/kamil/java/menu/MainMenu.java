package pl.k.kamil.java.menu;

import javax.swing.*;

import java.awt.event.*;



public class MainMenu extends WindowAdapter {
    JFrame f;
    public MainMenu() {
        f = new JFrame("Wypożyczalnia samochodów");
        final JTextField tf = new JTextField();

        tf.setBounds(50, 50, 150, 20);

        JButton rent = new JButton("Nowe wypożyczenie");
        rent.setBounds(50, 200, 200, 30);

        JButton carReturn = new JButton("Zwrot");
        carReturn.setBounds(250, 200, 200, 30);

        JButton update = new JButton("Aktualizacja");
        update.setBounds(450, 200, 200, 30);

        JButton search = new JButton("Wyszukiwanie");
        search.setBounds(650, 200, 200, 30);


        rent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Nowe wypożyczenie");
            }
        });


        carReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Zwrot");
            }
        });


        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UpdateMenu();
            }
        });


        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SearchMenu();
            }
        });


        f.add(rent);
        f.add(carReturn);
        f.add(update);
        f.add(search);

        f.add(tf);
        f.setSize(1000, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
        public void windowClosing(WindowEvent e) {
            int a=JOptionPane.showConfirmDialog(f,"Napewno chcesz zamknąć?");
            if(a==JOptionPane.YES_OPTION){
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }

}







