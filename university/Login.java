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

        JButton Login = new JButton("Login");
        Login.setBounds(40, 140, 120, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(Login);

        JButton Cancel = new JButton("Cancel");
        Cancel.setBounds(180, 140, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(Cancel);

        setSize(600, 300);
        setLocation(700, 350);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
