package universitymanagementsystem;
import java.awt.Font;

import javax.swing.*;

//to create a frame
public class AddStudent extends JFrame{

    AddStudent(){
        //frame size, location and visibility
        setSize(900, 700);
        setLocation(500, 200);

        setLayout(null);
        
        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(300, 70, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        setVisible(true);

    }

    public static void main(String[] args) {
        new AddStudent();
    }

}
