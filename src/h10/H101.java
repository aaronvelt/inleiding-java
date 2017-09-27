package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H101 extends Applet {
    int getal;
    TextField tekstvak;
    int uitkomst;

    @Override
    public void init() {
        tekstvak = new TextField(5);
        tekstvak.addActionListener(new Tekstvaklistener());
        add(tekstvak);
        uitkomst = 0;
    }

    class Tekstvaklistener implements ActionListener {
        public  void actionPerformed (ActionEvent e){
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > uitkomst ){
                uitkomst = getal;
            }

            repaint();

        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawString( "Het hoogste getal tot nu toe is :" + uitkomst,40,80);
    }
}
