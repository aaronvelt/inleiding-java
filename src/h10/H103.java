package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    @Override
    public void init() {
        tekstvak = new TextField("",5);
        label = new Label("Type het nummer van de maand en druk op enter");
        tekstvak.addActionListener( new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s );
            switch (maand){
                case 1:
                    tekst = "Januari";
                    break;
                case 2:
                    tekst = "Febrauri";
                    break;
                case 3:
                    tekst = "Maart";
                    break;
                case 4:
                    tekst = "April";
                    break;
                case 5:
                    tekst = "Mei";
                    break;
                case 6:
                    tekst = "Juni";
                    break;
                case 7:
                    tekst = "Juli";
                    break;
                case 8:
                    tekst = "Augustus";
                    break;
                case 9:
                    tekst = "September";
                    break;
                case 10:
                    tekst = "Oktober";
                    break;
                case 11:
                    tekst = "November";
                    break;
                case 12:
                    tekst = "December";
                    break;
                default:
                    tekst = "Dit is geen maand";
                    break;
            }
            repaint();
        }
    }
}
