package h11;

import java.applet.Applet;
import java.awt.*;

public class H114 extends Applet {
    int  som;
    int teller;

    @Override
    public void init() {
        teller = 0 ;
    }

    @Override
    public void paint(Graphics g) {
        int y = 20;
        for (som = 0; teller <10; som = 3 * teller){
            y += 20;
            g.drawString(""+som,20,y);
            teller++;
        }
    }
}
