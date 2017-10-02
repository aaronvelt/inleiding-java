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
                    tekst = "Januari dagen 31";
                    break;
                case 2:
                    tekst = "Febrauri dagen 28 of 29";
                    break;
                case 3:
                    tekst = "Maart dagen 31";
                    break;
                case 4:
                    tekst = "April dagen 30";
                    break;
                case 5:
                    tekst = "Mei dagen 31";
                    break;
                case 6:
                    tekst = "Juni dagen 30";
                    break;
                case 7:
                    tekst = "Juli dagen 31";
                    break;
                case 8:
                    tekst = "Augustus dagen 30";
                    break;
                case 9:
                    tekst = "September dagen 31";
                    break;
                case 10:
                    tekst = "Oktober dagen 30";
                    break;
                case 11:
                    tekst = "November dagen 31";
                    break;
                case 12:
                    tekst = "December 30 dagen";
                    break;
                default:
                    tekst = "Dit is geen maand";
                    break;
            }
            repaint();
        }
    }
}
