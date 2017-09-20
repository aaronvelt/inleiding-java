package h06;

import java.applet.Applet;
import java.awt.*;

public class Seconden extends Applet {
    int minuut;
    int uur;
    int dag;
    int jaar;


    @Override
    public void init() {
        minuut = 60;
        uur = minuut*60;
        dag = uur*24;
        jaar = dag*365;

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Een uur heeft  "  + uur + "  seconden",20,20 );
        g.drawString("Een dag heeft  "  + dag+ "  seconden",20,40 );
        g.drawString("En een jaar heeft  "  + jaar+ "  seconden",20,60);
    }
}
