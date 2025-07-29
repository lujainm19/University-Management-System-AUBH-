package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;

public class Marks extends JFrame{

    String IDno;

    Marks (String IDno) {
        this.IDno = IDno;

        setSize(550,650);
        setLocation(600,200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        //American University of Bahrain heading
        JLabel heading = new JLabel("American University of Bahrain");
        heading.setBounds(110, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        //Result of Examination heading
        JLabel subheading = new JLabel("Result of Examination");
        subheading.setBounds(160, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(subheading);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Marks("");
    }
}
