package h06;

import java.applet.Applet;
import java.awt.*;

public class GeldVerdelen extends Applet {
    int a;
    int b;
    int uitkomst;

    @Override
    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Aaron krijgt:" + uitkomst,20,20);
        g.drawString("Jan krijgt:" + uitkomst,20,40);
        g.drawString("Ali krijgt:" + uitkomst,20,60);
        g.drawString("Jeannette" + uitkomst,20,80);

    }
}
