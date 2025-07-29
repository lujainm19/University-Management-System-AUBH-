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


        //ID number heading
        JLabel lblIDno = new JLabel("ID number" + IDno);
        lblIDno.setBounds(60, 120, 500, 20);
        lblIDno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblIDno);

        //semester heading 
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 150, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);

        //sub1  
        JLabel sub1 = new JLabel();
        sub1.setBounds(60, 210, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);

        //sub2  
        JLabel sub2 = new JLabel();
        sub2.setBounds(60, 240, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);

        //sub3 
        JLabel sub3 = new JLabel();
        sub3.setBounds(60, 270, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);

        //sub4  
        JLabel sub4 = new JLabel();
        sub4.setBounds(60, 300, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);

        //sub5  
        JLabel sub5 = new JLabel();
        sub5.setBounds(60, 330, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);

        //sub6  
        JLabel sub6 = new JLabel();
        sub6.setBounds(60, 360, 500, 20);
        sub6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub6);

        setVisible(true);


    }

    public static void main(String[] args) {
        new Marks("");
    }
}
