package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(20, 20, 120, 20);
        g.drawString("Lijn", 60, 32);
        g.drawRect(20, 50, 100, 50);
        g.drawString("Rechthoek", 40, 112);
        g.drawRoundRect(20, 120, 100, 50, 30, 30);
        g.drawString("Afgeronde rechthoek", 20, 182);
        g.setColor(Color.magenta);
        g.fillRect(140, 50, 100, 50);
        g.setColor(Color.BLACK);
        g.drawOval(140, 50, 100, 50);
        g.drawString("Gevulde rechthoek met ovaal", 120, 112);
        g.setColor(Color.magenta);
        g.fillOval(140, 120, 100, 50);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal", 150, 182);
        g.drawOval(280, 120, 50, 50);
        g.drawString("Cirkel", 290, 182);
        g.setColor(Color.magenta);
        g.fillArc(280, 50, 100, 50, 0, 45);
        g.setColor(Color.BLACK);
        g.drawOval(280, 50, 100, 50);
        g.drawString("taarpunt met oval eromheen", 295, 112);
    }
}
