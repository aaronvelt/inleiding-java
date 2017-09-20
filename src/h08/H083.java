package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H083 extends Applet {
    Button knop;
    TextField Tekstvak;
    String s;
    Label label;
    Double getal;
    int berekening;

    @Override
    public void init() {
        label = new Label("type hier je beddrag->");
        add(label);
        knop = new Button();
        knop.setLabel("Bereken");
        knop.addActionListener(new KnopListener());
        add(knop);
        Tekstvak = new TextField(20);
        Tekstvak.addActionListener(new TekstvakListener());
        add(Tekstvak);
        berekening = berekening/100*21+berekening;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(s , 50, 70);
    }
    {
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = Tekstvak.getText();
            repaint();
        }
    }
}
