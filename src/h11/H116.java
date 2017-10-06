package h11;

import java.applet.Applet;
import java.awt.*;

public class H116 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int width = 5;
        int height = 5;
        int x = 100;
        int y = 100;
        while (teller < 5) {
            y -= 5;
            x -= 5;
            width += 10;
            height += 10;
            g.drawOval(x,x, width, height);
            teller++;
        }
    }
}
