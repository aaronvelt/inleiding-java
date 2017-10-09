package h11;

import java.applet.Applet;
import java.awt.*;

public class H119 extends Applet {
    int kolom;
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int breedte = 40;
        int hoogte = 40;
        g.drawRect(49,49,321,321);
        //rij 1
      for (kolom = 0; kolom <8; kolom++){

          if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
             g.setColor(Color.black);
             g.fillRect(x,y,breedte,hoogte);
          }
          else {
              g.setColor(Color.white);
              g.fillRect(x,y,breedte,hoogte);
          }
          x += breedte;
      }
      // rij 2
      x = 50;
      y += hoogte;
      for (int kolom = 0; kolom < 8; kolom++){
          if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
              g.setColor(Color.white);
              g.fillRect(x,y,breedte,hoogte);
          }
          else {
              g.setColor(Color.black);
              g.fillRect(x,y,breedte,hoogte);
          }
          x += breedte;
      }
      //rij 3
      x = 50;
      y +=hoogte;
      for (int kolom = 0; kolom < 8; kolom++){
          if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
              g.setColor(Color.black);
              g.fillRect(x, y, breedte, hoogte);
          }
          else{
              g.setColor(Color.white);
              g.fillRect(x,y,breedte,hoogte);
          }
          x +=breedte;
      }
        // rij 4
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //rij 5
        x = 50;
        y +=hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            else{
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            x +=breedte;
        }
        // rij 6
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
        //rij 7
        x = 50;
        y +=hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            else{
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            x +=breedte;
        }
        //rij 8
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }
    }

}
