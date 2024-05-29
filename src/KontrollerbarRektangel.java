import java.util.ArrayList;
import java.util.Arrays;

public class KontrollerbarRektangel extends Superclass {
    //extends JPanel implements Runnable, KeyListener {

    public KontrollerbarRektangel() {
        super(50, 300, 300);
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
        int delta_x = Math.abs(this.xCordinates - eatBallForRek.xCordinates);
        int delta_y = Math.abs(this.yCordinates - eatBallForRek.yCordinates);
        if (delta_x <= heightAndWith && delta_y <= heightAndWith) {
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


