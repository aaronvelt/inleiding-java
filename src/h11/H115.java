package h11;

import java.applet.Applet;
import java.awt.*;

public class H115 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        //g.drawRoundRect(20,20,40,40,5,5);
        int x = 20;
        int y = 20;
        int teller = 0;
        while (teller < 5){
            y += 39;
            x += 39;
            g.drawRoundRect(x,y,40,40,5,5);
            teller++;
        }
    }
}
