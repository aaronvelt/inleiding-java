package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkH6 extends Applet {
    double a;
    double b;
    double c;
    double gemiddelde;

    @Override
    public void init() {
       a = 6.3;
       b = 5.9;
       c = 6.9;
       gemiddelde =(a+b+c) / 3;
       gemiddelde = (int) (gemiddelde*10);
       gemiddelde = gemiddelde / 10;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het gemmidelde is:  "+ gemiddelde,20,20);
    }
}
