package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class TeacherLeaveDetails extends JFrame implements ActionListener{

    Choice cempIDno;
    JTable table;
    JButton search, print, update, add, cancel;

    TeacherLeaveDetails(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //Search by Student ID heading
        JLabel heading = new JLabel("Search by Faculty ID");
        heading.setBounds(20, 20, 150, 20);
        add(heading);

        cempIDno = new Choice();
        cempIDno.setBounds(180, 20, 150, 20);
        add(cempIDno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from faculty");
            while (rs.next()) {
                cempIDno.add(rs.getString("empID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //table
        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from facultyleave");
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
        search.addActionListener(this);
        add(search);

        //print button
        print  = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);


        //cancel button 
        cancel = new JButton("Cancel");
        cancel.setBounds(220, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);

        
        setSize(1000,700);
        setLocation(450,150);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            //Query added for search button, which conditionally retrieves data based on stdID
            String query = "select * from facultyleave where empIDno ='"+ cempIDno.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == print) {
            //because print commands are an external entity
            try {
                table.print(); //print table when print button clicked
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new TeacherLeaveDetails();
    }

}


