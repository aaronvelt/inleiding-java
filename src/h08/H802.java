package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H802 extends Applet {
    Button knop;
    int hmannen;
    int hvrouwen;
    int mleerling;
    int vleerling;
    int totaal;

    @Override
    public void init() {
        hmannen = 0;
        hvrouwen = 0;
        mleerling = 0;
        vleerling = 0;
        totaal = ( hmannen + hvrouwen + mleerling + vleerling );
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
        g.drawString("aantal mannen: " + hmannen,60,50);
        g.drawString("aantal vrouwen: " + hvrouwen,60,70);
        g.drawString("aantal potentiële mannen: " + mleerling,4,90);
        g.drawString("aantal potentiële vrouwen: " + vleerling,3,110);
        g.drawString("totaal: " + totaal,113,130);
    }
    class knoplistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            hmannen++;
            totaal++;
            repaint();
        }
    }
    class knopjelistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            hvrouwen++;
            totaal++;
            repaint();
        }
    }
    class knoperlistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            mleerling++;
            totaal++;
            repaint();
        }
    }
    class knopkelistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            vleerling++;
            totaal++;
            repaint();
        }
    }
}
