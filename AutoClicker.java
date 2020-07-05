import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;
import java.awt.*;

class AutoClicker {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Auto Clicker");
        JButton button = new JButton("Start");
        JLabel label1 = new JLabel("Auto Clicker");
        JLabel label2 = new JLabel("Set delay");
        JLabel label3 = new JLabel("Set number of clicks");

        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    Thread.sleep(5000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                main clicker = new main();

                for (int i = 0; i < 10; i++) {
                    clicker.click(InputEvent.BUTTON1_DOWN_MASK);

                }
                System.out.println("Clicking");
            }
        });
    }
}
