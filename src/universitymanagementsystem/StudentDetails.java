package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame{

    Choice cstdIDno;
    JTable table;
    JButton search, print, update, add, cancel;

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

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            //resultSetToTableModel function used to convert ResultSet from SQL into a TableModel 
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Scrollbar on table
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1000, 600);
        add(jsp);

        //search button
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        add(search);

        //print button
        print  = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        add(print);

        //add button
        add = new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add(add);

        //update button
        update = new JButton("Update");
        update.setBounds(320, 70, 80, 20);
        add(update);

        //cancel button 
        cancel = new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        add(cancel);

        
        setSize(1000,700);
        setLocation(450,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentDetails();
    }

}
