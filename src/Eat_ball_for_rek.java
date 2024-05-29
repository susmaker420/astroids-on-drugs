import javax.swing.*;
import java.awt.*;

public class Eat_ball_for_rek extends Superclass {

    public Eat_ball_for_rek(int xCords, int yCords, int heighAndWidth) {
        super(heighAndWidth, xCords, yCords);
    }

    public Eat_ball_for_rek() {
        super(20, 500, 500);
    }

    /*public void paintComponent(JPanel jpanel) {
        super.PaintComponent(jpanel);
    }

     */


    public int getXPos() {
        //xCordinates = 200;
        return xCordinates;
    }

    public int getYPos() {
        // yCordinates = 200;
        return yCordinates;
    }
}
