package h10;

import javafx.event.ActionEvent;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class PraktijkH10 extends Applet {
    TextField tekstvak;
    Label label;
    int cijfer;
    String s, tekst;

    @Override
    public void init() {
        label = new Label("Voer hier je cijfer in --->");
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        tekst = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            if (cijfer == 1 || cijfer == 2 || cijfer == 3 ){
                tekst = "Je cijfer is Slecht";
            }
            if (cijfer == 4){
                tekst = "Je cijfer is onvoldoende";
            }
            if ( cijfer == 5){
                tekst = "Je cijfer is matig";
            }
            if ( cijfer == 6 || cijfer == 7){
                tekst = "Je cijfer is voldoende";
            }
            if ( cijfer == 8 || cijfer == 9 || cijfer == 10){
                tekst = "Je cijfer is goed";
            }
            else{
                tekst = "Je hebt een verkeerd cijfer ingevoerd";
            }
            repaint();
        }
    }
}
