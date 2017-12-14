package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class PraktijkH14 extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    int input, aantal, randomg;
    int getallen[] = {1, 2, 3};
    String foutmelding, uitslag;
    Image coin, chest, skull;
    URL pad;


    @Override
    public void init() {
        aantal = 23;
        pad = PraktijkH14.class.getResource("/img/");
        coin = getImage(pad, "goldcoin.jpg");
        label = new Label("Hoeveel munten neem je (één, twee of drie)?");
        tekstvak = new TextField(1);
        knop = new Button("OK");
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                input = Integer.parseInt(s);
                int random = new Random().nextInt(getallen.length);
                randomg = (getallen[random]);
                if (input == 1 || input == 2 || input == 3) {
                    foutmelding = "";
                    aantal = aantal - input;
                    if (aantal == 22 || aantal == 18 || aantal == 14 || aantal == 10 || aantal == 6 || aantal == 2) {
                        aantal = aantal - 1;
                    } else if (aantal == 20 || aantal == 16 || aantal == 12 || aantal == 8 || aantal == 4) {
                        aantal = aantal - 3;
                    } else if (aantal == 19 || aantal == 15 || aantal == 11 || aantal == 7 || aantal == 3) {
                        aantal = aantal - 2;
                    } else if (aantal == 21) {
                        aantal = aantal - randomg;
                    } else if (aantal == 17) {
                        aantal = aantal - randomg;
                    } else if (aantal == 13) {
                        aantal = aantal - randomg;
                    } else if (aantal == 9) {
                        aantal = aantal - randomg;
                    } else if (aantal == 5) {
                        aantal = aantal - randomg;
                    } else if (aantal == 1 && input == 1 || aantal == 1 && input == 2 || aantal == 1 && input == 3) {
                        aantal = aantal - 1;
                        chest = getImage(pad, "chest.jpg");
                        uitslag = "Je hebt gewonnen";
                    } else if (aantal <= 0 && input == 1 || aantal <= 0 && input == 2 || aantal <= 0 && input == 3) {
                        aantal = aantal - 1;
                        skull = getImage(pad, "skull.jpg");
                        uitslag = "Je hebt verloren";
                    }
                }
                if (input > 3) {
                    foutmelding = "Foute Invoer!!!";
                }
                repaint();
            }
        });
        add(label);
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        int x = 30;
        int y = 50;
        for (int i = 0; i < aantal; i++) {
            g.drawImage(coin, x, y, 40, 40, this);
            x += 50;
            if (i == 4) {
                x = 30;
                y += 50;
            }
            if (i == 9) {
                x = 30;
                y += 50;
            }
            if (i == 14) {
                x = 30;
                y += 50;
            }
            if (i == 19) {
                x = 30;
                y += 50;
            }
        }
        g.drawString(foutmelding, 50, 40);
        g.drawString("Aantal munten: " + aantal, 180, 40);
        g.drawString(uitslag, 50, 70);
        g.drawImage(chest, 50, 90, 120, 120, this);
        g.drawImage(skull, 50, 90, 120, 120, this);
    }
}