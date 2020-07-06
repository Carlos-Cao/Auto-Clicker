import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;

public class AutoClicker {
    public AutoClicker() {
        JFrame frame = new JFrame("Auto Clicker");
        GridBagConstraints c = new GridBagConstraints();
        frame.setLayout(new GridBagLayout());
        frame.setIconImage(new ImageIcon("images\\mouse-cursor.png").getImage());

        JButton button = new JButton("Start");
        frame.add(button);

        JLabel label1 = new JLabel("Set delay");
        frame.add(label1);

        JLabel label2 = new JLabel("Set number of clicks");
        frame.add(label2);

        JComboBox combo1 = new JComboBox();
        frame.add(combo1);

        JComboBox combo2 = new JComboBox();
        frame.add(combo2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Press Ok to start Auto Clicking in five seconds.");

                try {
                    Thread.sleep(5000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                Main clicker = new Main();

                for (int i = 0; i < 10; i++) {
                    clicker.click(InputEvent.BUTTON1_DOWN_MASK);

                }
            }
        });
    }

    public static void main(String args[]) {

    }
}
