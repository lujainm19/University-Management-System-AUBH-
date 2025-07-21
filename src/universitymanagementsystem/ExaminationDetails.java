package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;

public class ExaminationDetails  extends JFrame{

    JTextField search;
    JButton cancel, submit;

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

        //TextField under heading to search by std ID number.
        search = new JTextField();
        search.setBounds(80, 90, 200, 30);
        search.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(search);

        submit = new JButton("View Result");
        submit.setBounds(300,90,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        //submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Back");
        cancel.setBounds(440,90,150,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        //cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setVisible(true);
    }


    public static void main(String[] args) {
        new ExaminationDetails();
    }
}


