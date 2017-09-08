package h05;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram extends Applet {
    //decleratie
    int breedte;
    int jeroen;
    int valerie;
    int hans;

    @Override
    public void init() {
        breedte = 50;
        jeroen = 200;
        valerie = 80;
        hans = 160;
    }

    @Override
    public void paint(Graphics g) {
        //lijn en cijfers voor kg
        g.drawLine(75,10,75,210);
        g.drawString("kg",37,210);
        g.drawString("0",60,210);
        g.drawString("20",55,170);
        g.drawString("40",55,130);
        g.drawString("60",55,90);
        g.drawString("80",55,50);
        g.drawString("100",50,10);
        //Jeroen
        g.setColor(Color.blue);
        g.fillRect(75,10,breedte,jeroen);
        //valerie
        g.setColor(Color.GREEN);
        g.fillRect(175,130,breedte,valerie);
        //Hans
        g.setColor(Color.red);
        g.fillRect(125,50,breedte,hans);
    }
}
