package h11;
// Dit is niet praktijk opdracht 10 maar 11!!!
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH10 extends Applet {
    TextField tekstvak;
    Button knop;
    int tafel, y , x;

    @Override
    public void init() {
        tekstvak = new TextField(5);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        if (tafel != 0) {
            int x = 50;
            int y = 60;
            for (int i = 1; i <= 10; i++) {
                g.drawString(i + "x" + tafel + "=" + i * tafel, x, y);
                y += 20;
            }
        }
    }

    class KnopListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            String s = tekstvak.getText();
            tafel = Integer.parseInt( s );
            repaint();
        }
    }
}
