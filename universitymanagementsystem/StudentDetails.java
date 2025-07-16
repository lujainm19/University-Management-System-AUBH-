package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class StudentDetails extends JFrame{

    Choice cstdIDno;
    JTable table;

    StudentDetails(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Search by Student ID");
        heading.setBounds(20, 20, 150, 20);
        add(heading);

        cstdIDno = new Choice();
        cstdIDno.setBounds(180, 20, 150, 20);
        add(cstdIDno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                cstdIDno.add(rs.getString("stdID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //table
        table = new JTable();

        //Scrollbar on table
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1000, 600);
        add(jsp);

        
        setSize(1000,700);
        setLocation(450,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentDetails();
    }

}
