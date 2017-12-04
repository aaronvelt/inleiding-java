package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 150, 75, 90, 365);
    }
}