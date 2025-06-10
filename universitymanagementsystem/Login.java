package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login  extends JFrame implements ActionListener{

    JButton Login, Cancel;
    JTextField tfusername, tfpassword;

    Login () {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username: ");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150,20);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password: ");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        Login = new JButton("Login");
        Login.setBounds(40, 140, 120, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener((this));
        Login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(Login);

        Cancel = new JButton("Cancel");
        Cancel.setBounds(180, 140, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener((this));
        Cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(Cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
		add(image);

        setSize(600, 300);
        setLocation(700, 350);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Login) {
            String username = tfusername.getText();
            String password = tfpassword.getText();

            //checks if a user's username and password exist in the login table of the database.
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
        
             //Mysql is an excel entity query so chances of error so error handling
            try {
                Conn c = new Conn();
                c.s.executeQuery(query);

            } catch (Exception e) {
                e.printStackTrace();
            }
        
        } else if (ae.getSource() == Cancel) {
            setVisible(false);
        }
       
    }


    public static void main(String[] args) {
        new Login();
    }

}
