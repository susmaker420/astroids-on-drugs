public class KontrollerbarRektangel {
    //extends JPanel implements Runnable, KeyListener {
    int heightAndWidth = 50;
    int xCordinates = 500 - (heightAndWidth / 2);
    int yCordinates = 500 - (heightAndWidth / 2);


    public KontrollerbarRektangel() {

    }

    public void updateKontrollerbarRektangel(int xdiff) {
        xCordinates = xCordinates + xdiff;
    }

    public void updatekontrollerbarrektangel(int ydiff) {
        yCordinates = yCordinates + ydiff;
    }

    public void andraYkordinater(int y) {
        this.yCordinates = yCordinates + y;
    }

    public void andraXkordinater(int x) {
        this.xCordinates = yCordinates + x;
    }

    public boolean intersects(Eat_ball_for_rek eatBallForRek) {
        boolean away = false;
        boolean touche = true;
        int delta_x =(xCordinates-eatBallForRek.getXPos());
        int delta_y =(yCordinates- eatBallForRek.getYPos());
        if (){

        }
    }
}

