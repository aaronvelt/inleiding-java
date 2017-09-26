package testmap;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leeftijd extends Applet {
    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
        g.drawString("" + 6 + " is groter dan "+ 5 + " en kleiner dan " +
                8  + ": " +(6 > 5 || 6 < 8), 50, 60 );
        g.drawString("" + 6 + " is groter dan "+ 5 + " en groter dan " +
                8 + ": " + (6 > 5 || 6 > 8), 50, 80 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en groter dan " +
                8 + ": " + (6 <  5 || 6 > 8), 50, 100 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en kleiner dan " +
                8 + ": " + (6 < 5 || 6 < 8), 50, 120 );
        g.drawString("" + 6 + " is groter dan " + 5 + ": " +
                (!(6 > 5)), 50, 140);
        g.drawString("" + 6 + " is kleiner dan " + 5 + ": " +
                (! (6 < 5)), 50, 160 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt( s );
            if ( leeftijd > 20 ) {
                tekst = "U bent meerderjarig.";
            }
            else {
                tekst = "u bent minderjarig";
            }
            repaint();
        }
    }
}

