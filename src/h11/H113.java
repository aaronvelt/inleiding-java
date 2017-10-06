package h11;

import java.applet.Applet;
import java.awt.*;

public class H113 extends Applet {
    int getal1;
    int getal2;
    int som;

    @Override
    public void init() {
        getal1 = 0;
        getal2 = 1;
        som = getal1 + getal2;
    }

    @Override
    public void paint(Graphics g) {
        int x = 20;
        for (som = 0; som <100; som= getal1 + getal2) {
            x += 20;
            g.drawString("" + som, x, 60);
            getal1 = getal2;
            getal2 = som;
        }
    }
}
