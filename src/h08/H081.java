package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H081 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knopje;

    @Override
    public void init() {
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplistener() );
        tekstvak = new TextField("",20);
        add(tekstvak);
        knopje = new Button("Reset");
        add(knopje);
        knopje.addActionListener(new Knopjelistener());
    }
    //OK knop
    class Knoplistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Het werkt goed");
            repaint();
        }
    }
    //Reset knop
    class Knopjelistener implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
