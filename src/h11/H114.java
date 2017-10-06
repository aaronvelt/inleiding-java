package h11;

import java.applet.Applet;
import java.awt.*;

public class H114 extends Applet {
    int  som;
    int teller;
    int drie;

    @Override
    public void init() {
        teller = 0 ;
        drie = 3;
    }

    @Override
    public void paint(Graphics g) {
        int y = 20;
        for (som = 0; som <30; som = drie * teller){
            y += 20;
            g.drawString(""+som,20,y);
            teller++;
        }
    }
}
