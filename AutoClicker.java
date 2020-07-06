import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;

public class AutoClicker {
    private JFrame frame;
    private JButton button;
    private JLabel label1;
    private JLabel label2;
    private JComboBox combo1;
    private JComboBox combo2;

    public AutoClicker() {
        frame = new JFrame("Auto Clicker");
        frame.setLayout(new GridBagLayout());
        frame.setIconImage(new ImageIcon("images\\mouse-cursor.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        setComponents();
        frame.setVisible(true);
    }

    private void setComponents() {
        button = new JButton("Start");
        frame.add(button);

        label1 = new JLabel("Set delay");
        frame.add(label1);

        label2 = new JLabel("Set number of clicks");
        frame.add(label2);

        combo1 = new JComboBox();
        frame.add(combo1);

        combo2 = new JComboBox();
        frame.add(combo2);

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
