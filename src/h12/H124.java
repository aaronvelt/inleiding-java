package h12;
//Maak een applet met een tabel met getallen, waarin de gebruiker een getal kan intikken in een tekstvak.
// Als de gebruiker op de OK-knop klikt dan wordt de waarde opgezocht in de tabel en staat op het scherm niet alleen
// dat de waarde is gevonden maar ook de index. Als de waarde niet is gevonden dan wordt daarvan melding gedaan.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H124 extends Applet{
    boolean gevonden;
    boolean geklikt;
    Button knop;
    TextField tekstvak;
    int[]  getallen = { 1, 4, 8, 12, 9, 7};
    int indexPositie;

    @Override
    public void init() {
        tekstvak = new TextField(10);
        knop = new Button("OK");
        gevonden = false;

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                geklikt = true;
                gevonden = false;
                int input = Integer.parseInt( tekstvak.getText());
                for (int i = 0; i < getallen.length; i++) {
                    int getal = getallen[i];
                    if (getal == input ) {
                        gevonden = true;
                        indexPositie = i;
                    }
                }
                repaint();
            }
        });
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        if(gevonden == true && geklikt == true) {
            g.drawString("de waarde is gevonden", 50, 60);
            g.drawString("index = " + indexPositie, 50, 75);
        }
        if(gevonden == false && geklikt == true) {
            g.drawString("De waarde is niet gevonden",50,60);
        }
    }
}
