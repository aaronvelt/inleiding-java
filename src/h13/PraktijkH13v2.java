package h13;

import java.applet.Applet;
import java.awt.*;

//2. Gebruik de methode uit opdracht 1 om een boomgaard te tekenen
// die uit tenminste 2 rijen van minimaal 5 bomen bestaat.
public class PraktijkH13v2 extends Applet {


    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        tekenboomen(g,125,125,100,75,50,125,100,100);
    }

    void tekenboomen (Graphics g,int xr, int yr, int xc, int yc, int wijdter, int hoogter, int wijdtec, int hoogtec){
        g.setColor(Color.orange);
        g.fillRect(xr,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc,yc,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr + 100,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc + 100,yc,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr + 200,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc + 200,yc,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr + 300,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc + 300,yc,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr + 400,yr,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc + 400,yc,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr,yr+150,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc,yc+150,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr +100,yr+150,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc +100,yc+150,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr +200,yr+150,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc +200,yc+150,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr +300,yr+150,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc +300,yc+150,wijdtec,hoogtec);

        g.setColor(Color.orange);
        g.fillRect(xr +400,yr+150,wijdter,hoogter);
        g.setColor(Color.green);
        g.fillOval(xc +400,yc+150,wijdtec,hoogtec);
    }
}
