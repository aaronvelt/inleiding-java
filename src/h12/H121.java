package h12;

import java.applet.Applet;
import java.awt.*;

public class H121 extends Applet {
    double[] getal;
    double[] gemiddelde;

    @Override
    public void init() {
        getal = new double[10];
        gemiddelde = new double[10];
        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] =1 * teller + 1;
        }
        gemiddelde[0] = ((getal[0] + getal[1] + getal[2] + getal[3] + getal[4] + getal[5] + getal[6] + getal[7] + getal[8] + getal[9]) /10);
    }

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal [teller],50,20* teller +20);
            g.drawString("" + gemiddelde[0] ,150,20);
        }
    }
}