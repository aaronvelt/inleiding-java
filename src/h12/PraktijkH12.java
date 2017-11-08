package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH12 extends Applet {
    private TextField tekstvak;
    private TextField teletekstvak;
    private Button knop;
    private String[] namen;
    private String[] nummers;
    int aantalkliks;

    private final static int AANTAL_INVOER = 10;

    @Override
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        teletekstvak = new TextField(10);
        add(teletekstvak);
        knop = new Button("OK");
        add(knop);
        namen = new String[AANTAL_INVOER];
        nummers = new String[AANTAL_INVOER];
        aantalkliks = 0;

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namen[aantalkliks] = tekstvak.getText();
                nummers[aantalkliks] = teletekstvak.getText();
                aantalkliks++;
                if (aantalkliks == AANTAL_INVOER){
                    repaint();
                    aantalkliks = 0;
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
            int x1 = 50;
            int x2 = 150;
            int y = 70;
            for (int i = 0; i < AANTAL_INVOER; i++) {
                g.drawString(namen[i], x1, y);
                g.drawString(nummers[i], x2, y);
                y += 20;
            }
    }
}
