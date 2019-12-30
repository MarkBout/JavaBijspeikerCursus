package H02;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField invoer;
    double km, userinput, uitkomst;
    String message;

    public void init() {
        setSize(600, 600);
        invoer = new TextField(10);
        invoer.addActionListener(new Conversie());
        add(invoer);
        //1 mijl is 1.6km
        km = 1.6;
        userinput = 0;
        uitkomst = 0;
        message = "Voer een afstand in mijlen in en druk op enter om deze naar km te berekenen";

    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 50);
    }

    public class Conversie implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        userinput = Double.parseDouble(invoer.getText());
        uitkomst = (userinput * km);
        message = userinput + " Mijl is " + uitkomst + " Kilometer";
        repaint();
        }
    }
}
