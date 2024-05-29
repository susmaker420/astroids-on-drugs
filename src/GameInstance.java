import javax.swing.*;

public class GameInstance extends JFrame {


    public GameInstance() {

        GamePanel gamePanel = new GamePanel(1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1000, 1000);
        this.setLayout(null);
        this.add(gamePanel);
        //this.add(pilen);

        this.setVisible(true);


    }
}