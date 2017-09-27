package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H102 extends Applet {
    int getal;
    TextField tekstvak;
    int uitkomstH;
    int uitkomstL;
    boolean geklikt;

    @Override
    public void init() {
        tekstvak = new TextField(5);
        tekstvak.addActionListener(new Tekstvaklistener());
        add(tekstvak);
        uitkomstH = (Integer.MIN_VALUE);
        uitkomstL = (Integer.MAX_VALUE);
        geklikt = false;
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Integer.parseInt(tekstvak.getText());
            geklikt = true;
            if (getal > uitkomstH) {
                uitkomstH = getal;
            }
            if (getal < uitkomstL) {
                uitkomstL = getal;
            }
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {

        if (geklikt) {
            g.drawString("Het hoogste getal tot nu toe is :" + uitkomstH, 40, 80);
            g.drawString("Het laagste getal tot nu toe is :" + uitkomstL, 40, 100);
        }

    }
}
