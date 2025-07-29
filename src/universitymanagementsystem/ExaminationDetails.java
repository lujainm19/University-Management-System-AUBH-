package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails  extends JFrame implements ActionListener{

    JTextField search;
    JButton cancel, submit;
    JTable table;

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
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Back");
        cancel.setBounds(480,90,150,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);


        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //Scrollbar incase content too much to fit
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 130, 1000, 310);
        add(jsp);

        try { //To get data from query, try catch added with connection to Conn class by object.
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 2).toString());// retrives value from coloumn 3 (stdID)
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource() == submit) { 
            setVisible(false);
            new Marks(search.getText());

        } else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new ExaminationDetails();
    }
}


