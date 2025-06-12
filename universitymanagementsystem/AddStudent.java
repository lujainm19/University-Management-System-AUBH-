package universitymanagementsystem;
import java.awt.Font;

import javax.swing.*;

//to create a frame
public class AddStudent extends JFrame{

    JTextField tfname, tffname, tfId;

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

         //Father's Name: heading
        JLabel lblfname = new JLabel("Father's Name:");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        //Student ID: heading
        JLabel lblId = new JLabel("Student ID:");
        lblId.setBounds(50, 200, 200, 30);
        lblId.setFont(new Font("serif", Font.BOLD, 20));
        add(lblId);

        tfId = new JTextField();
        tfId.setBounds(200, 200, 150, 30);
        add(tfId);

        setVisible(true);

    }

    public static void main(String[] args) {
        new AddStudent();
    }

}
