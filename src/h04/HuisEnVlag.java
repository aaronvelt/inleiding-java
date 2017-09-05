package h04;

import java.applet.Applet;
import java.awt.*;

public class HuisEnVlag extends Applet {
    @Override
    public void init() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(50,200,120,100);
        g.drawLine(175,200,120,100);
        g.drawRect(50,200,125,125);
        g.drawRect(85,250,40,75);
        g.drawRect(100,150,20,20);
        g.drawLine(110,170,110,150);
        g.drawLine(100,160,120,160);
        g.drawLine(300,30,300,175);
        g.setColor(Color.red);
        g.fillRect(300,30,80,22);
        g.setColor(Color.white);
        g.fillRect(300,52,80,22);
        g.setColor(Color.BLUE);
        g.fillRect(300,74,80,22);
    }
}
