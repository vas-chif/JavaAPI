package modulo4.craps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CrapsSlideMain {
    public static void main(String[] args) {

        Frame frame = new Frame("Craps");
        frame.setSize(1000, 100);
        frame.setVisible(true);
        JApplet CrapsSlide = new CrapsSlide();
        frame.add(CrapsSlide);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


        CrapsSlide.init();

    }// end main method

}// end class CrapsSlideMain
