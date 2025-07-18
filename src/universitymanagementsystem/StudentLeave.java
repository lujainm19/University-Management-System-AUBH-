package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;


public class StudentLeave extends JFrame {

    Choice cstdIDno, ctime; 
    JDateChooser dcdate;

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

        JLabel lblIDno = new JLabel("Search by Student ID");
        lblIDno.setBounds(60, 100, 200, 20);
        lblIDno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblIDno);

        cstdIDno = new Choice();
        cstdIDno.setBounds(60, 130, 200, 20);
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

        //Date Calendar
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 20);
        lbldate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lbldate);

        dcdate = new JDateChooser();
        dcdate.setBounds(60, 210, 200, 20);
        add(dcdate);

        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200, 20);
        lbltime.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lbltime);

        ctime = new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("Full day");
        ctime.add("Half day");
        add(ctime);


        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentLeave();
    }

}
