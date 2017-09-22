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
    double  uitkomst;
    int getalA;
    int getalB;


    @Override
    public void init() {
        //eerste tekstvak
        tekstvakA = new TextField(10);
        add(tekstvakA);
        //tweede tekstvak
        tekstvakB = new TextField(10);
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
    //de * knop
    class knopAListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
           String tv1 = tekstvakA.getText();
           double invoer1 = Double.parseDouble(tv1);
           String tv2 = tekstvakB.getText();
           double invoer2 = Double.parseDouble(tv2);
           uitkomst = invoer1*=invoer2;
            tekstvakA.setText("" + uitkomst);
            tekstvakB.setText(" ");
            repaint();
        }
    }
    //de / knop
    class knopBListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String tv1 = tekstvakA.getText();
            double invoer1 = Double.parseDouble(tv1);
            String tv2 = tekstvakB.getText();
            double invoer2 = Double.parseDouble(tv2);
            uitkomst = invoer1/=invoer2;
            tekstvakA.setText("" + uitkomst);
            tekstvakB.setText(" ");
            repaint();
        }
    }
    //de + knop
    class knopCListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String tv1 = tekstvakA.getText();
            double invoer1 = Double.parseDouble(tv1);
            String tv2 = tekstvakB.getText();
            double invoer2 = Double.parseDouble(tv2);
            uitkomst = invoer1+=invoer2;
            tekstvakA.setText("" + uitkomst);
            tekstvakB.setText(" ");
            repaint();
        }
    }
    //de - knop
    class knopDListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String tv1 = tekstvakA.getText();
            double invoer1 = Double.parseDouble(tv1);
            String tv2 = tekstvakB.getText();
            double invoer2 = Double.parseDouble(tv2);
            uitkomst = invoer1-=invoer2;
            tekstvakA.setText("" + uitkomst);
            tekstvakB.setText(" ");
            repaint();
        }
    }
}
