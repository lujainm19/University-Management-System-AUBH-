import javax.swing.*;
import java.awt.*;

public class Login  extends JFrame{

    Login () {

        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username: ");
        add(lblusername);

        setSize(600, 300);
        setLocation(700, 350);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
