import javax.swing.SwingUtilities;

public class RunAutoClicker implements Runnable {

    public void run() {
        AutoClicker c = new AutoClicker();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new RunAutoClicker());
    }

}
