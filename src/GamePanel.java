import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GamePanel extends JPanel implements KeyListener {
    KontrollerbarRektangel kontrollerbarRektangel;
    Eat_ball_for_rek eat_ball_for_rek;
    ArrayList<Integer> flearabollar = new ArrayList<Integer>();


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
        g.fillRect(kontrollerbarRektangel.xCordinates, kontrollerbarRektangel.yCordinates, kontrollerbarRektangel.heightAndWith, kontrollerbarRektangel.heightAndWith);
        g.setColor(Color.darkGray);
        g.fillRect(eat_ball_for_rek.yCordinates, eat_ball_for_rek.yCordinates, eat_ball_for_rek.heightAndWith, eat_ball_for_rek.heightAndWith);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            int xdiff = -5;
            kontrollerbarRektangel.updateKontrollerbarRektangelX(xdiff);

        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            int xdiff = +5;
            kontrollerbarRektangel.updateKontrollerbarRektangelX(xdiff);

        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            int ydiff = +5;
            kontrollerbarRektangel.updateKontrollerbarrektangelY(ydiff);

        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            int ydiff = -5;
            kontrollerbarRektangel.updateKontrollerbarrektangelY(ydiff);

        }
        kollakoledering();
        repaint();

    }

    public void kollakoledering() {
        if (kontrollerbarRektangel.intersects(eat_ball_for_rek)) {
            System.out.println(kontrollerbarRektangel.heightAndWith);
            kontrollerbarRektangel.heightAndWith += 20;
            System.out.println(kontrollerbarRektangel.heightAndWith);
        } else {

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
        /*System.out.println("click");
        showDot = !showDot;
        repaint();*/


}