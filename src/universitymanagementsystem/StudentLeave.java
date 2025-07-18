package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;

public class StudentLeave extends JFrame {
    StudentLeave(){

        setSize(650, 700);
        setLocation(650, 200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        //Apply Leave (Student) heading
        JLabel heading = new JLabel("Apply Leave (Student)");
        heading.setBounds(40, 50, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentLeave();
    }

}
