package h05;

import java.applet.Applet;
import java.awt.*;

public class Figuren extends Applet {
    //decleratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    @Override
    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
                breedte = 200;
                        hoogte = 100;
    }

    @Override
    public void paint(Graphics g) {
        //rechthoek
        g.drawRect(100,100,breedte,hoogte);
        //afgeronde rechthoek
        g.drawRoundRect(100,225,breedte,hoogte,30,30);
        //gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315,100,breedte,hoogte);
        //ovaal
        g.setColor(lijnkleur);
        g.drawOval(315,100,breedte,hoogte);
        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315,225,breedte,hoogte);
        //cirkel
        g.setColor(lijnkleur);
        g.drawOval(530,225,100,100);
        //taartpunt met ovaal
        g.setColor(opvulkleur);
        g.fillArc(530,100,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(530,100,breedte,hoogte);
    }
}
