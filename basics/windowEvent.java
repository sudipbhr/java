import java.awt.*;
import java.awt.event.*;

public class windowEvent extends Frame implements WindowListener {

    public windowEvent() {
        addWindowListener(this);
        setSize(400, 400);
        setVisible(true);
    }

    // Required methods of WindowListener interface
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
        //window iconified is called when the window is minimized

    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new windowEvent();
    }
}