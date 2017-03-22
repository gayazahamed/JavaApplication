package aplet;

import java.applet.*;

import java.awt.*;

public class MainAplet extends Applet {
    public void paint(Graphics g) {
        System.out.println("111111111111");
        g.drawString("Welcome in Java Applet111.", 40, 20);
    }
}
