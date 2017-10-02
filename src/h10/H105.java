package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H105 extends Applet {
    TextField tekstvak;
    Double gemmidelde;
    String s, tekst;
    int count;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new Teksvaklistener());
        tekst = "";
        gemmidelde = 0.0;
        add(tekstvak);
    }

    class Teksvaklistener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            s = tekstvak.getText();
            Double cijfer = Double.parseDouble( s );
            repaint();
            if ( cijfer >= 5.5){
                tekst = "voldoende";
            }
            else{
                tekst = "onvoldoende";
            }
            gemmidelde = gemmidelde + cijfer;
            count++;
        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
        g.drawString("" + gemmidelde/count,50,80);
    }
}
