package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H105 extends Applet {
    Label label;
    TextField tekstvak;
    int cijfer;
    int newcijfer;
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
            cijfer = Integer.parseInt( s );
            switch (cijfer){
                case 1:

                    tekst = cijfer + "dit is onvoldoende";
                    break;
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }
}
