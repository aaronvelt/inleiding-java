package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Maak een tabel, waarin elementen dezelfde waarde hebben. In de applet kan de gebruiker een waarde intikken.
// Vervolgens laat het programma de waarde zien en hoeveel keer de waarde voorkomt.


public class H126 extends Applet {
    TextField tekstvak;
    Button knop;
    int[] waarden = { 7, 7, 7, 7, 7};
    int resultaat;

    @Override
    public void init() {
        tekstvak = new TextField(5);
        knop = new Button("OK");

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int input = Integer.parseInt(tekstvak.getText());
                for (int i = 0; i < waarden.length; i++) {
                    int waarde = waarden[i];
                    if (waarde == input){
                        resultaat = waarden.length;
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
        g.drawString("De waarde komt " + resultaat + " keer voor.",50,60);
    }
}
