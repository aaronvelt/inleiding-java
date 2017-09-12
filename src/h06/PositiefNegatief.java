package h06;

import java.applet.Applet;
import java.awt.*;

public class PositiefNegatief extends Applet {
   private int a;

    @Override
    public void init() {
        a = 2147483647;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("hier is de uitkomst"+ a+a,20,20);
    }
}
