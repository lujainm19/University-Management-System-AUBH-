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
        heading.setBounds(100, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Marks("");
    }
}
