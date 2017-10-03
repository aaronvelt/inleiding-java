package h11;

import java.applet.Applet;
import java.awt.*;

public class H111 extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10 ) {
            x += 20;
            g.drawLine(x,50,x,150);
            g.drawString(""+teller,x,50);
            teller++;
        }
    }
}
