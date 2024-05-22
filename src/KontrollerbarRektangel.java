import java.util.ArrayList;
import java.util.Arrays;

public class KontrollerbarRektangel extends Superclass {
    //extends JPanel implements Runnable, KeyListener {

    public KontrollerbarRektangel() {
        yCordinates = 300;
        heightAndWith = 50;
        xCordinates = 300;
    }

    public void updateKontrollerbarRektangelX(int xdiff) {
        xCordinates = xCordinates + xdiff;
//        mittenAvRektangeln[1] = (xCordinates + (heightAndWidth / 2));
    }

    public void updateKontrollerbarrektangelY(int ydiff) {
        yCordinates = yCordinates + ydiff;
//        mittenAvRektangeln[2] = (xCordinates + (heightAndWidth / 2));
    }


    public boolean intersects(Eat_ball_for_rek eatBallForRek) {
        int delta_x = (xCordinates - eatBallForRek.getXPos());
        int delta_y = (yCordinates - eatBallForRek.getYPos());
        if (delta_x <= 0 && delta_y <= 0) {
            System.out.println("EATEN");
            return true;
        }
        return false;
    }

  /*  public void hämtaAndraRektanglarsVärden(int[] mittenAvRektangeln, int längdOchHöjd) {
        andraRektanglarsLängdOchHöjd.add(längdOchHöjd);
        andraRektanglarsMittpunkt.add(mittenAvRektangeln);
*/
}


