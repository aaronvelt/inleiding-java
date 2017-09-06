package h04;

import java.applet.Applet;
import java.awt.*;

public class Domino extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(75,75,125,125,10,10);
        g.setColor(Color.BLACK);
        g.fillOval(85,85,40,40);
        g.fillOval(150,85,40,40);
        g.fillOval(85,145,40,40);
        g.fillOval(150,145,40,40);
    }
}
