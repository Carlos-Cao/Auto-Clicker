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
    private JPanel panel;
    private GridBagConstraints c;
    private GridBagLayout l;

    // Implement GUI
    public AutoClicker() {
        frame = new JFrame("Auto Clicker");
        panel = new JPanel();
        l = new GridBagLayout();
        c = new GridBagConstraints();
        panel.setLayout(l);
        frame.setIconImage(new ImageIcon("images\\mouse-cursor.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        setComponents();
        frame.add(panel);

        frame.setVisible(true);
    }

    // Set up Java components
    private void setComponents()  {
        button = new JButton("Start");
        c.gridx = 5;
        c.gridy = 10;
        c.gridwidth = 12;
        c.gridheight = 3;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.NORTH;
        l.setConstraints(button, c);
        panel.add(button);

        label1 = new JLabel("Set number of clicks");
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 6;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.NORTH;
        l.setConstraints(label1, c);
        panel.add(label1);

        label2 = new JLabel("Set delay in seconds");
        c.gridx = 1;
        c.gridy = 7;
        c.gridwidth = 6;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.NORTH;
        l.setConstraints(label2, c);
        panel.add(label2);

        Integer[] datacombo1 = { 10, 50, 100, 500, 1000 };
        combo1 = new JComboBox(datacombo1);
        c.gridx = 8;
        c.gridy = 4;
        c.gridwidth = 8;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.NORTH;
        l.setConstraints(combo1, c);
        panel.add(combo1);

        Integer[] datacombo2 = { 1, 2, 3, 4, 5 };
        combo2 = new JComboBox(datacombo2);
        c.gridx = 8;
        c.gridy = 7;
        c.gridwidth = 8;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.NORTH;
        l.setConstraints(combo2, c);
        panel.add(combo2);

        // Button action listener to loop left mouse clicks
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(frame,
                        "Select Yes for Auto Clicker to begin clicking in 5 seconds.", "Run Auto Clicker?", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    Main clicker = new Main();
                    Integer clicks = (Integer) combo1.getSelectedItem();
                    Integer delay = (Integer) combo2.getSelectedItem();

                    for (int i = 0; i < clicks; i++) {
                        try {
                            Thread.sleep(delay * 1000);
                            clicker.click(InputEvent.BUTTON1_DOWN_MASK);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }

                    }
                    JOptionPane.showMessageDialog(frame, "Auto Clicker successfully clicked " + clicks + " times.");
                }
                else if (result == JOptionPane.NO_OPTION){
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

}
