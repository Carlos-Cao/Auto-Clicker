import java.awt.Robot;

public class Main {
    private Robot robot;
    private int delay;

    public Main() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //delay = 250;
    }

    // Robot class to control mouse
    public void click(int button) {
        try {
            robot.mousePress(button);
            //robot.delay(250);
            robot.mouseRelease(button);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int ms) {
        this.delay = ms;
    }
}