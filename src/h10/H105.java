package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H105 extends Applet {
    Label label;
    TextField tekstvak;
    Double gemmidelde;
    String s, tekst;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new Teksvaklistener());
        tekst = "";
        add(tekstvak);
    }

    class Teksvaklistener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            s = tekstvak.getText();
            Double cijfer = Double.parseDouble( s );
            if ( cijfer > 5 ){
                gemmidelde = gemmidelde + (cijfer * 2) / 2;
                tekst = gemmidelde + "Het is voldoende";
            }
            else{
                tekst = cijfer + "Het is onvoldoende";
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }
}
