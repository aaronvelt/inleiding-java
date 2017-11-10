package h13;

import java.applet.Applet;
import java.awt.*;

public class H132 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        tekenmuur(g,50,50,50,25);
    }

    void tekenmuur (Graphics g, int x1, int y1, int wijde, int hoogte){
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
}