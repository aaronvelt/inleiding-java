package h12;
//Maak een applet waarin vijf tekstvakken (uiteraard in een tabel) worden getoond. In de tekstvakken moet de gebruiker
// getallen in kunnen voeren. Als de gebruiker op de Ok-knop klikt worden de getallen
// in oplopende volgorde gesorteerd getoond in de tekstvakken.


import testmap.Array;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H123 extends Applet {
    Button knop;
    TextField[] tekstvakken;
    int aantalvelden = 5;


    public void init() {
        tekstvakken = new TextField[aantalvelden];
        knop = new Button("OK");
        for (int i = 0;i < tekstvakken.length;i ++){
            tekstvakken[i] = new TextField(5);
            add(tekstvakken[i]);
        }
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] invoer = new int[aantalvelden];
                for (int i = 0; i < aantalvelden; i++) {
                    invoer[i] = Integer.parseInt(String.valueOf(tekstvakken[i].getText()));

                }
                Arrays.sort(invoer);
                for (int i = 0; i < aantalvelden; i++) {
                    tekstvakken[i].setText(String.valueOf(invoer[i]));
                }

            }
        });
        add(knop);
    }
}
