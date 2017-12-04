package h04;

import java.applet.Applet;
import java.awt.*;

public class Diagram extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(75, 10, 75, 210);
        g.drawString("kg", 37, 210);
        g.drawString("0", 60, 210);
        g.drawString("20", 55, 170);
        g.drawString("40", 55, 130);
        g.drawString("60", 55, 90);
        g.drawString("80", 55, 50);
        g.drawString("100", 50, 10);
        g.setColor(Color.blue);
        g.fillRect(75, 10, 50, 200);
        g.setColor(Color.red);
        g.fillRect(125, 50, 50, 160);
        g.setColor(Color.GREEN);
        g.fillRect(175, 130, 50, 80);
        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 75, 225);
        g.drawString("Hans", 125, 225);
        g.drawString("Valerie", 175, 225);

    }
}
