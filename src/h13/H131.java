package h13;

import java.applet.Applet;
import java.awt.*;

public class H131 extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        tekendriehoek(g , 50,150,100,50,150,150);
    }

    void tekendriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x1, y1, x3, y3);
    }
}