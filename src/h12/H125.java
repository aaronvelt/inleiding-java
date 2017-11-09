package h12;
//Zorg ervoor dat de lus waarin gezocht wordt naar een bepaalde waarde in voorbeeld 12.4
// stopt als de waarde gevonden is.
// Zoek op internet hoe je dit kunt doen.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H125 extends Applet {
    boolean gevonden;
    Button knop;
    TextField tekstvak;
    int[]  getallen = { 1, 4, 8, 12, 9, 7};
    int indexPositie;

    @Override
    public void init() {
        tekstvak = new TextField(10);
        knop = new Button("OK");
        gevonden = false;

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gevonden = false;
                int input = Integer.parseInt( tekstvak.getText());
                for (int i = 0; i < getallen.length; i++) {
                    int getal = getallen[i];
                    if (getal == input ) {
                        gevonden = true;
                        indexPositie = i;
                    }
                }
                repaint();
            }
        });
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("de waarde is gevonden", 50, 60);
            g.drawString("index = " + indexPositie, 50, 75);
        }
        if(gevonden == false) {
            g.drawString("De waarde is niet gevonden",50,60);
        }
    }

}
