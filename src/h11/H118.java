package h11;

import java.applet.Applet;
import java.awt.*;

public class H118 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int width = 5;
        int height = 5;
        while(teller < 100){
            width += 5;
            height += 5;
            g.drawOval(50,50,width,height);
            teller++;
        }
    }
}
