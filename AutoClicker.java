import javax.swing.*;
import java.awt.event.*;

class AutoClicker {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Auto Clicker");
        JButton button = new JButton("Start");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setVisible(true);
    }
}
