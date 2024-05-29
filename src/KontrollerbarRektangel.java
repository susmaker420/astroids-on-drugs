import java.util.ArrayList;
import java.util.Arrays;

public class KontrollerbarRektangel extends Superclass {
    //extends JPanel implements Runnable, KeyListener {

    public KontrollerbarRektangel() {
        super(50, 300, 300); // säger hur stor den och vart den ska vara
    }

    public void updateKontrollerbarRektangelX(int xdiff) { // kollar om den har rörts sig
        xCordinates = xCordinates + xdiff;
//        mittenAvRektangeln[1] = (xCordinates + (heightAndWidth / 2));
    }

    public void updateKontrollerbarrektangelY(int ydiff) { // kollar om den har rörts sig
        yCordinates = yCordinates + ydiff;
//        mittenAvRektangeln[2] = (xCordinates + (heightAndWidth / 2));
    }


    public boolean intersects(Eat_ball_for_rek eatBallForRek) { // inersects funsktionen säger hur den detektar att den rör en annan rektangel
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


