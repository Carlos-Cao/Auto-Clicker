import java.awt.Robot;

public class main {
    private Robot robot;
    private int delay;

    public main() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        delay = 300;
    }

}