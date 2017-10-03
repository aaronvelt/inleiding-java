package testmap;

import java.applet.Applet;
import java.awt.*;


public class While extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}
