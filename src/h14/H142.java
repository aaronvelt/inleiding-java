package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class H142 extends Applet {
    Boolean klik;
    Button knop;
    String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "koninging",
            "koning", "aas"};
    String[] kleuren = {"Klaver", "Schoppen", "Harten", "Ruiten"};
    String[] deck;
    String speler1[] = new String[13];
    String speler2[] = new String[13];
    String speler3[] = new String[13];
    String speler4[] = new String[13];
    URL pad;
    AudioClip sound;


    @Override
    public void init() {
        pad = H142.class.getResource("/sounds/");
        sound = getAudioClip(pad, "geluidkaart.wav");
        knop = new Button("Deel kaarten");
        klik = false;
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klik = true;
                sound.play();
                deck = new String[52];
                int indexDeck = 0;
                for (int i = 0; i < kleuren.length; i++) {
                    String kleur = kleuren[i];
                    for (int j = 0; j < kaarten.length; j++) {
                        String kaart = kaarten[j];
                        String resultaat = kleur + " " + kaart;
                        deck[indexDeck] = resultaat;
                        indexDeck++;
                    }
                }
                for (int i = 0; i < 13; i++) {
                    speler1[i] = deelKaart();
                    speler2[i] = deelKaart();
                    speler3[i] = deelKaart();
                    speler4[i] = deelKaart();
                }
                repaint();
            }
        });
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        if (klik == true) {
            int x1 = 20;
            int x2 = 140;
            int x3 = 260;
            int x4 = 380;
            int y = 50;
            g.drawString("Speler 1", x1, y);
            g.drawString("Speler 2", x2, y);
            g.drawString("Speler 3", x3, y);
            g.drawString("Speler 4", x4, y);
            y += 20;

            for (int i = 0; i < 13; i++) {
                g.drawString(speler1[i], x1, y);
                g.drawString(speler2[i], x2, y);
                g.drawString(speler3[i], x3, y);
                g.drawString(speler4[i], x4, y);
                y += 20;
            }
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}