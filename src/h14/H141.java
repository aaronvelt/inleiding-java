package h14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//Schrijf een applet waarin het delen van één kaarten wordt gesimuleerd.
// Er wordt willekeurig een kleuren en binnen die kleuren een willekeurige kaarten gekozen.
// Maak een array voor de kleuren en één voor de kaarten binnen de kleuren.
// Laat de keuze als volgt in het venster van de applet zien, bijvoorbeeld: Ruiten aas.
public class H141 extends Applet {
    Boolean klik;
    Button knop;
    String randomk;
    String randomkl;
    String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "koninging",
            "koning", "aas"};
    String[] kleuren = {"Klaver", "Schoppen", "Harten", "Ruiten"};

    public void init() {
        knop = new Button("Deel kaarten");
        add(knop);
        klik = false;
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klik = true;
                int random = new Random().nextInt(kaarten.length);
                randomk = (kaarten[random]);
                int random1 = new Random().nextInt(kleuren.length);
                randomkl = (kleuren[random1]);
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        if (klik == true) {
            g.drawString("" + randomkl + " " + randomk, 50, 60);
        }
    }
}