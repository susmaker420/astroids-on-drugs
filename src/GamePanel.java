import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener {
    KontrollerbarRektangel kontrollerbarRektangel;
    Eat_ball_for_rek eat_ball_for_rek;
    ArrayList<Eat_ball_for_rek> flerabollar = new ArrayList<>();


    /**
     * constructor
     */
    public GamePanel(int panelSize) {
        flerabollar.add(new Eat_ball_for_rek(randomish(), randomish(), 20));
        flerabollar.add(new Eat_ball_for_rek(randomish(), randomish(), 20));
        flerabollar.add(new Eat_ball_for_rek(randomish(), randomish(), 20));
        flerabollar.add(new Eat_ball_for_rek(randomish(), randomish(), 20));
        flerabollar.add(new Eat_ball_for_rek(randomish(), randomish(), 20));
        flerabollar.add(new Eat_ball_for_rek(randomish(), randomish(), 20));
        this.setBounds(0, 0, panelSize, panelSize);
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.addKeyListener(this);
        kontrollerbarRektangel = new KontrollerbarRektangel();
        //eat_ball_for_rek = new Eat_ball_for_rek();
    }

    public int randomish() {
        Random randomspawn = new Random();
        return randomspawn.nextInt(10, 800);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(kontrollerbarRektangel.xCordinates, kontrollerbarRektangel.yCordinates, kontrollerbarRektangel.heightAndWith, kontrollerbarRektangel.heightAndWith);
        g.setColor(Color.darkGray);
        for (int i = 0; i < flerabollar.size(); i++) {
            Eat_ball_for_rek rekt = flerabollar.get(i);
            g.fillRect(rekt.xCordinates, rekt.yCordinates, 20, 20);
        }

        //  g.fillRect(eat_ball_for_rek.yCordinates, eat_ball_for_rek.yCordinates, eat_ball_for_rek.heightAndWith, eat_ball_for_rek.heightAndWith);
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
        for (int i = 0; i < flerabollar.size(); i++) {
            Eat_ball_for_rek rekt = flerabollar.get(i);
            if (kontrollerbarRektangel.intersects(rekt)) {
                System.out.println(kontrollerbarRektangel.heightAndWith);
                kontrollerbarRektangel.heightAndWith += 20;
                System.out.println(kontrollerbarRektangel.heightAndWith);
                flerabollar.remove(i);
                i--;
            } else {

            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
        /*System.out.println("click");
        showDot = !showDot;
        repaint();*/


}