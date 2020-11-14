package pl.k.kamil.java;


import pl.k.kamil.java.menu.MainMenu;

import java.awt.*;

public class App


{

public static void main( String[] args )
    {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }


    }

