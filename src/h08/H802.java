package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H802 extends Applet {
    Button knop;
    int a;
    int b;
    int c;
    int d;
    String s;
    String z;
    String y;
    String h;
    String t;
    int totaal;

    @Override
    public void init() {
        a = 60;
        b = 50;
        c = 40;
        d = 35;
        totaal = ( a + b + c + d );
        knop = new Button("M");
        add(knop);
        knoplistener kl = new knoplistener();
        knop.addActionListener( kl );
        knop = new Button("V");
        add(knop);
        knopjelistener kjl = new knopjelistener();
        knop.addActionListener( kjl );
        knop = new Button("PM");
        knoperlistener krl = new knoperlistener();
        knop.addActionListener(krl);
        add(knop);
        knop = new Button("PV");
        add(knop);
        knopkelistener kkl = new knopkelistener();
        knop.addActionListener(kkl);
    }

    @Override
    public void paint(Graphics g) {
        //zinnen voor de getallen
        g.drawString("aantal mannen:",60,50);
        g.drawString("aantal vrouwen:",60,70);
        g.drawString("aantal potentiële mannen:",4,90);
        g.drawString("aantal potentiële vrouwen:",3,110);
        g.drawString("totaal:",113,130);
        g.drawString(s,150,50);
        g.drawString(z,150,70);
        g.drawString(y,150,90);
        g.drawString(h,150,110);
        g.drawString(t + totaal,150,130);
    }
    class knoplistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            s = "60";
            repaint();
        }
    }
    class knopjelistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            z = "50";
            repaint();
        }
    }
    class knoperlistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            y = "40";
            repaint();
        }
    }
    class knopkelistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            h = "35";
            t = "";
            repaint();
        }
    }
}
