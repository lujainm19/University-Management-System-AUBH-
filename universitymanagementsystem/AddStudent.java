package universitymanagementsystem;
import java.awt.Font;

import javax.swing.*;

//to create a frame
public class AddStudent extends JFrame{

    JTextField tfname;

    AddStudent(){
        //frame size, location and visibility
        setSize(900, 700);
        setLocation(500, 200);

        setLayout(null);
        
        //New Student Details heading
        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        //Name: heading
        JLabel lblname = new JLabel("Name:");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        setVisible(true);

    }

    public static void main(String[] args) {
        new AddStudent();
    }

}
