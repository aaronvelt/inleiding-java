package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H081 extends Applet {
    private TextField tekstvak;
    private Button knop;
    private Button knopje;
    private String s;

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
        s ="";
    }
    //OK knop
    class Knoplistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
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

    @Override
    public void paint(Graphics g) {
        g.drawString(s,50,60);
    }
}
