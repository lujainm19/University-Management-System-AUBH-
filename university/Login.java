import javax.swing.*;
import java.awt.*;

public class Login  extends JFrame{

    Login () {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username: ");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150,20);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password: ");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);

        JPasswordField tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        setSize(600, 300);
        setLocation(700, 350);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
