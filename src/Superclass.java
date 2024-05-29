import javax.swing.*;
import java.awt.*;

public class Superclass {
    int heightAndWith;
    int xCordinates;
    int yCordinates;

    public Superclass(int heightAndWith, int xCordinates, int yCordinates) {
        this.heightAndWith = heightAndWith;
        this.xCordinates = xCordinates;
        this.yCordinates = yCordinates;
    }
/*
    public void PaintComponent(JPanel jPanel) {
        Graphics g = jPanel.getGraphics();
        jPanel.paintComponents(g);
        g.setColor(Color.darkGray);
        g.fillRect(yCordinates, xCordinates, heightAndWith, heightAndWith);
    }

 */
}
