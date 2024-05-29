import javax.swing.*;

public class GameInstance extends JFrame {

    // skappar jpanel så hur framen ska ser ut
    public GameInstance() {
        GamePanel gamePanel = new GamePanel(1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1000, 1000); // detta gör så att den har en storlek på 1000 åt varje håll
        this.setLayout(null);
        this.add(gamePanel);
        //this.add(pilen);

        this.setVisible(true);


    }
}