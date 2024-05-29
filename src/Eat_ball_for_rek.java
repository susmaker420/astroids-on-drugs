import javax.swing.*;
import java.awt.*;

public class Eat_ball_for_rek extends Superclass { // tar info ifrån superclass

    public Eat_ball_for_rek(int xCords, int yCords, int heighAndWidth) { // säger att den ska dom tre info från superclassen
        super(heighAndWidth, xCords, yCords);
    }

    public Eat_ball_for_rek() {//
        super(20, 500, 500); // betsämmer hur den ska vara
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
