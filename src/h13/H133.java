package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H133 extends Applet {
    boolean gekliktr;
    boolean gekliktg;
    Button knoprood, knopgrijs;

    @Override
    public void init() {
        knoprood = new Button("Rode Bakstenen");
        knopgrijs = new Button("Grijze Betonblokken");
        add(knoprood);
        add(knopgrijs);

        knoprood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gekliktg = false;
                gekliktr = true;
               repaint();
            }
        });

        knopgrijs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               gekliktr = false;
               gekliktg = true;
               repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        if (gekliktr == true) {
            RodeBaksteen(g,50, 50, 50, 25);
        }
        if (gekliktg == true) {
            GrijzeBeton(g,50,50,70,45);
        }
    }

    void RodeBaksteen (Graphics g, int x1, int y1, int wijde, int hoogte){
        g.setColor(Color.red);
        g.fillRect( x1, y1, wijde, hoogte);
        g.fillRect( x1 +55, y1, wijde, hoogte);
        g.fillRect( x1 +110, y1, wijde, hoogte);
        g.fillRect( x1, y1 +30, wijde, hoogte);
        g.fillRect( x1 +55, y1 +30, wijde, hoogte);
        g.fillRect( x1 +110, y1 +30, wijde, hoogte);
        g.fillRect( x1, y1 +60, wijde, hoogte);
        g.fillRect( x1 +55, y1 +60, wijde, hoogte);
        g.fillRect( x1 +110, y1 +60, wijde, hoogte);
    }
    void GrijzeBeton (Graphics g, int x1, int y1, int wijde, int hoogte){
        g.setColor(Color.gray);
        g.fillRect( x1, y1, wijde, hoogte);
        g.fillRect( x1 +75, y1, wijde, hoogte);
        g.fillRect( x1 +150, y1, wijde, hoogte);
        g.fillRect( x1, y1 +50, wijde, hoogte);
        g.fillRect( x1 +75, y1 +50, wijde, hoogte);
        g.fillRect( x1 +150, y1 +50, wijde, hoogte);
        g.fillRect( x1, y1 +100, wijde, hoogte);
        g.fillRect( x1 +75, y1 +100, wijde, hoogte);
        g.fillRect( x1 +150, y1 +100, wijde, hoogte);
    }
}
