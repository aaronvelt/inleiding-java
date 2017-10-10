package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH11v2 extends Applet {
    Button knop;
    int tafel;

    @Override
    public void init() {
       knop = new Button("OK");
       knop.addActionListener(new KnopListener());
       add(knop);
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 60;
        for (int i = 1; i <= 10&& tafel <= 10; i++) {
            g.drawString(i + "x " + tafel +"  =" + i * tafel, x, y);
            y += 20;
        }
    }

    class KnopListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            tafel++;
            repaint();
        }
    }
}
