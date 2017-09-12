package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkH6 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het gemmidelde is  "+(5.9+6.3+6.9)/3,20,20);
    }
}
