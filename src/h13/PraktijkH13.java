package h13;
//1. Maak een applet met een methode om een eenvoudige boom te tekenen.
// Bedenk zelf welke argumenten de methode zou moeten hebben.
import org.w3c.dom.css.RGBColor;

import java.applet.Applet;
import java.awt.*;

public class PraktijkH13 extends Applet {


    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        tekenboom(g,125,125,100,75,50,125,100,100);
    }

    void tekenboom (Graphics g,int xr, int yr, int xc, int yc, int wijdter, int hoogter, int wijdtec, int hoogtec){
        g.setColor(Color.orange);
        g.fillRect(xr,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc,yc,wijdtec,hoogtec);
    }
}
