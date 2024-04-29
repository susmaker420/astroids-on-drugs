import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GamePanel extends JPanel implements KeyListener {
    KontrollerbarRektangel kontrollerbarRektangel;
    Eat_ball_for_rek eat_ball_for_rek;

    /**
     * constructor
     */
    public GamePanel(int panelSize) {
        this.setBounds(0, 0, panelSize, panelSize);
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.addKeyListener(this);
        kontrollerbarRektangel = new KontrollerbarRektangel();
        eat_ball_for_rek = new Eat_ball_for_rek();
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(kontrollerbarRektangel.xCordinates, kontrollerbarRektangel.yCordinates, kontrollerbarRektangel.heightAndWidth, kontrollerbarRektangel.heightAndWidth);
        g.setColor(Color.darkGray);
        g.fillRect(eat_ball_for_rek.spawnxcord, eat_ball_for_rek.spawnycord, eat_ball_for_rek.heightandwith, eat_ball_for_rek.heightandwith);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            int xdiff = -5;
            kontrollerbarRektangel.updateKontrollerbarRektangel(xdiff);
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            int xdiff = +5;
            kontrollerbarRektangel.updateKontrollerbarRektangel(xdiff);
            kontrollerbarRektangel.intersects(eat_ball_for_rek);
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            int ydiff = +5;
            kontrollerbarRektangel.updatekontrollerbarrektangel(ydiff);
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            int ydiff = -5;
            kontrollerbarRektangel.updatekontrollerbarrektangel(ydiff);
            repaint();
        }

    }

    public void kollakoledering() {
        if (kontrollerbarRektangel.intersects(eat_ball_for_rek)) {

        }
    }
    /*
    public boolean intersects(Eat_ball_for_rek eatBallForRek) {
        boolean away = false;
        boolean touche = true;
        int delta_x = (50 - 20);
        int delta_y = (50 - 20);


    }

     */

    @Override
    public void keyReleased(KeyEvent e) {

    }
        /*System.out.println("click");
        showDot = !showDot;
        repaint();*/


}