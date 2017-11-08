package h12;
//Maak een applet met een array van 25 knoppen. De knoppen hoeven niets te doen, maar moeten wel zichtbaar zijn.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H122 extends Applet {
    Button[] knoppen;

    @Override
    public void init() {
        knoppen = new Button[25];
        for (Button knop : knoppen) {
            knop = new Button();
            add(knop);
        }
    }
}