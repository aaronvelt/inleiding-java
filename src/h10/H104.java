package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H104 extends Applet {
    TextField tekstvak, tekstvak2;
    Label label;
    String s, tekst,s2;
    int maand, jaartal;

    @Override
    public void init() {
        tekstvak = new TextField("",4);
        label = new Label("eerst nummer maand daarna jaartal");
        tekstvak.addActionListener( new H104.TekstvakListener());
        tekstvak2 = new TextField("",4);
        tekstvak2.addActionListener( new H104.TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
        add (tekstvak2);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s );
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt( s2 );
            boolean schrikkeljaar = (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0;
            switch (maand){
                case 1:
                    if (schrikkeljaar) {
                        tekst = "Januari dagen 31 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Januari dagen 31 het is geen schrikkeljaar";
                    }
                    break;
                case 2:
                   if (schrikkeljaar) {
                       tekst = "Februari dagen 29 het is een schrikkeljaar";
                   }
                   else{
                       tekst = "Febraurri dagen 28 het is geen schrikkeljaar";
                   }
                   break;
                case 3:
                    if (schrikkeljaar) {
                        tekst = "Maart dagen 31 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Maart dagen 31 het is geen schrkkiljaar";
                    }
                    break;
                case 4:
                    if (schrikkeljaar) {
                        tekst = "April dagen 30 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "April dagen 30 het is geen schrikkeljaar";
                    }
                    break;
                case 5:
                    if (schrikkeljaar){
                        tekst = "Mei dagen 31 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Mei dagen 31 het is geen schrikkel jaar";
                    }
                    break;
                case 6:
                    if (schrikkeljaar) {
                        tekst = "Juni dagen 30 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Juni dagen 30 het is geen schrikkeljaar";
                    }
                    break;
                case 7:
                    if (schrikkeljaar) {
                        tekst = "Juli dagen 31 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Juli dagen 31 het is geen schrikkeljaar";
                    }
                    break;
                case 8:
                    if (schrikkeljaar) {
                        tekst = "Augustus dagen 30 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Augustus dagen 30 het is geen schrikkeljaar";
                    }
                    break;
                case 9:
                    if (schrikkeljaar) {
                        tekst = "September dagen 31 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "September dagen 31 het is een schrikkeljaar";
                    }
                    break;
                case 10:
                    if (schrikkeljaar) {
                        tekst = "Oktober dagen 30 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "Oktober dagen 31 het is geen schrikkeljaar";
                    }
                    break;
                case 11:
                    if (schrikkeljaar) {
                        tekst = "November dagen 31 het is een schrikkeljaar";
                    }
                    else{
                        tekst = "November dagen 31 het is geen schrikkeljaar";
                    }
                    break;
                case 12:
                    if (schrikkeljaar){
                    tekst = "December 30 dagen het is een schrikkeljaar";
                    }
                    else{
                        tekst = "December dagen 31 het is geen schrikkeljaar";
                    }
                    break;
                default:
                    tekst = "(foute maand invoer)";
                    break;
            }
            repaint();
        }
    }
}

