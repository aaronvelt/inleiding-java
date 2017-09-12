package h06;

import java.applet.Applet;
import java.awt.*;

public class Seconden extends Applet {
    int a;
    int b;
    int c;

    @Override
    public void init() {
        a = 60;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Een uur heeft  "  + a*a + "  seconden",20,20 );
        g.drawString("Een dag heeft  "  + 3600*24+ "  seconden",20,40 );
        g.drawString("En een jaar heeft  "  + 86400*365+ "  seconden",20,60);
    }
}
