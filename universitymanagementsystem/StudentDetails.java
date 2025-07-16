package universitymanagementsystem;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;

public class StudentDetails extends JFrame{
    StudentDetails(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setSize(1000,700);
        setLocation(450,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentDetails();
    }

}
