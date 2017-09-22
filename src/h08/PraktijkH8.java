package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH8 extends Applet {
    Button knopA;
    Button knopB;
    Button knopC;
    Button knopD;
    TextField tekstvakA;
    TextField tekstvakB;
    String  uitkomst;
    double getalA;
    double getalB;


    @Override
    public void init() {
        //eerste tekstvak
        tekstvakA = new TextField(10);
        tekstvakA.addActionListener(new tekstvakAListener());
        add(tekstvakA);
        //tweede tekstvak
        tekstvakB = new TextField(10);
        tekstvakB.addActionListener(new tekstvakBListener());
        add(tekstvakB);
        // de * knop
        knopA = new Button();
        knopA.setLabel("*");
        knopA.addActionListener(new knopAListener());
        add(knopA);
        // de / knop
        knopB = new Button();
        knopB.setLabel("/");
        knopB.addActionListener(new knopBListener());
        add(knopB);
        // de + knop
        knopC = new Button();
        knopC.setLabel("+");
        knopC.addActionListener(new knopCListener());
        add(knopC);
        // de - knop
        knopD = new Button();
        knopD.setLabel("-");
        knopD.addActionListener(new knopDListener());
        add(knopD);

    }
    class tekstvakAListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvakA.setText("");
            repaint();
        }
    }
    class tekstvakBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvakB.setText("");
            repaint();
        }
    }
    //de * knop
    class knopAListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvakB.setText("");
            repaint();
        }
    }
    //de / knop
    class knopBListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvakB.setText("");
            repaint();
        }
    }
    //de + knop
    class knopCListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvakB.setText("");
            repaint();
        }
    }
    //de - knop
    class knopDListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvakB.setText("");
            repaint();
        }
    }
}
