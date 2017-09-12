package h05;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram extends Applet {
    //decleratie
    int hoogteas;
    int breedte;
    int jeroen;
    int valerie;
    int hans;

    @Override
    public void init() {
        hoogteas = 210;
        breedte = 50;
        jeroen = 100;
        valerie = 40;
        hans = 80;
    }

    @Override
    public void paint(Graphics g) {
        //lijn en kg
        g.drawLine(75,10,75,210);
        g.drawString("kg",37,210);
        g.drawString("0",60,210);
        g.drawString("20",55,190);
        g.drawString("40",55,170);
        g.drawString("60",55,150);
        g.drawString("80",55,130);
        g.drawString("100",50,110);
        //jeroen
        g.setColor(Color.blue);
        g.fillRect(75,hoogteas-jeroen,50,jeroen);
        //hans
        g.setColor(Color.red);
        g.fillRect(125,hoogteas-hans,50,hans);
        //valerie
        g.setColor(Color.GREEN);
        g.fillRect(175,hoogteas-valerie,50,valerie);
        //namen
        g.setColor(Color.BLACK);
        g.drawString("Jeroen",75,225);
        g.drawString("Hans",125,225);
        g.drawString("Valerie",175,225);
    }
}
