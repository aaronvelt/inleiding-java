package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRoundRect(100,50,80,140,10,10);
        g.setColor(Color.red);
        g.fillOval(125,60,35,35);
        g.setColor(Color.orange);
        g.fillOval(125,100,35,35);
        g.setColor(Color.GREEN);
        g.fillOval(125,140,35,35);
    }
}
