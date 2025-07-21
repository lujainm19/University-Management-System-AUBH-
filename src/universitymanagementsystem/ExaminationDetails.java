package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;

public class ExaminationDetails  extends JFrame{

    ExaminationDetails() {
        setSize(1000, 550);
        setLocation(450, 250);


        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        //View Results
        JLabel heading = new JLabel("View Results");
        heading.setBounds(80, 15, 400, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(heading);

        setVisible(true);
    }


    public static void main(String[] args) {
        new ExaminationDetails();
    }
}


