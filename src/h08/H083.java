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
    double getal;

    @Override
    public void init() {
        label = new Label("type hier je beddrag->");
        add(label);
        knop = new Button();
        knop.setLabel("OK");
        knop.addActionListener(new KnopListener());
        add(knop);
        Tekstvak = new TextField(20);
        Tekstvak.addActionListener(new TekstvakListener());
        add(Tekstvak);
        getal = getal / 100 * 121;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + getal / 100 * 121 , 50, 70);
    }
    {
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = Tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}
