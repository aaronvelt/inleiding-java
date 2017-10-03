package h11;

import java.applet.Applet;
import java.awt.*;

public class H112 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 10;
        int x = 0;

        do {
            x += 20;
            g.drawString("" + teller, x, 50);
            teller++;
        } while(teller >= 10 && teller <= 20);
    }
}
