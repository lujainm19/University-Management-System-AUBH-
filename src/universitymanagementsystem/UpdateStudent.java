package universitymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener{

    JTextField tfphone, tfemail, tfnationality, tfgender, tftype, tfcollege, tfenrollment, tfmajor, tfsemester;
    JButton update, cancel;
    Choice cstdIDno;

    UpdateStudent(){
        //frame size, location and visibility
        setSize(900, 650);
        setLocation(500, 200);

        setLayout(null);
        
        //New Student Details heading
        JLabel heading = new JLabel("Update Student Details");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 35));
        add(heading);

        //Search by Student ID heading
        JLabel lblstdIDnumber = new JLabel("Select Student ID");
        lblstdIDnumber.setBounds(50, 100, 200, 20);
        lblstdIDnumber.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblstdIDnumber);

        cstdIDno = new Choice();
        cstdIDno.setBounds(250, 100, 200, 20);
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

        
        //Name: heading
        JLabel lblname = new JLabel("Name:");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelname);

        //Father's Name: heading
        JLabel lblfname = new JLabel("Father's Name:");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        JLabel labelfname = new JLabel();
        labelfname.setBounds(600, 150, 150, 30);
        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelfname);

        //Student ID: heading
        JLabel lblId = new JLabel("Student ID:");
        lblId.setBounds(50, 200, 200, 30);
        lblId.setFont(new Font("serif", Font.BOLD, 20));
        add(lblId);

        JLabel labelId = new JLabel();
        labelId.setBounds(200, 200, 150, 30);
        labelId.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelId);

        //Phone No. : heading
        JLabel lblphone = new JLabel("Phone No. :");
        lblphone.setBounds(400, 200, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 200, 150, 30);
        add(tfphone);


        //Gender: heading
        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(50, 250, 200, 30);
        lblgender.setFont(new Font("serif", Font.BOLD, 20));
        add(lblgender);

        JLabel labelgender = new JLabel();
        labelgender.setBounds(200, 250, 150, 30);
        labelgender.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelgender);

        //Nationality: heading
        JLabel lblnationality = new JLabel("Nationality:");
        lblnationality.setBounds(400, 250, 200, 30);
        lblnationality.setFont(new Font("serif", Font.BOLD, 20));
        add(lblnationality);

        tfnationality = new JTextField();
        tfnationality.setBounds(600, 250, 150, 30);
        add(tfnationality);
        
        
        //Student Email: heading
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        //Student Type: heading
        JLabel lbltype = new JLabel("Student Type:");
        lbltype.setBounds(400, 300, 200, 30);
        lbltype.setFont(new Font("serif", Font.BOLD, 20));
        add(lbltype);

        tftype = new JTextField();
        tftype.setBounds(600, 300, 150,30);
        add(tftype);

        //College Dept.:  heading
        JLabel lblcollege = new JLabel("College Dept. :");
        lblcollege.setBounds(50, 350, 200, 30);
        lblcollege.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcollege);
    
        tfcollege = new JTextField();
        tfcollege.setBounds(200, 350, 150, 30);
        add(tfcollege);

        //Enrollmenent Status: heading
        JLabel lblenrollment = new JLabel("Enrollmenent Status:");
        lblenrollment.setBounds(400, 350, 200, 30);
        lblenrollment.setFont(new Font("serif", Font.BOLD, 20));
        add(lblenrollment);

        tfenrollment = new JTextField();
        tfenrollment.setBounds(600, 350, 150, 30);
        add(tfenrollment);

        //Major:  heading
        JLabel lblmajor = new JLabel("Major:");
        lblmajor.setBounds(50, 400, 200, 30);
        lblmajor.setFont(new Font("serif", Font.BOLD, 20));
        add(lblmajor);

        tfmajor = new JTextField();
        tfmajor.setBounds(200, 400, 150, 30);
        add(tfmajor);

        //Semester: heading
        JLabel lblsemester = new JLabel("Semester:");
        lblsemester.setBounds(400, 400, 200, 30);
        lblsemester.setFont(new Font("serif", Font.BOLD, 20));
        add(lblsemester);

        tfsemester = new JTextField();
        tfsemester.setBounds(600, 400, 150, 30);
        add(tfsemester);

        // to retrieve unchangeable data from student database and display it on the frame
        try {
            Conn c = new Conn();
            String query = "select * from student where stdID ='"+cstdIDno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelId.setText(rs.getString("stdID"));
                tfphone.setText(rs.getString("phone"));
                labelgender.setText(rs.getString("gen"));
                tfnationality.setText(rs.getString("nationality"));
                tfemail.setText(rs.getString("email"));
                tftype.setText(rs.getString("tp"));
                tfcollege.setText(rs.getString("col"));
                tfenrollment.setText(rs.getString("enr"));
                tfmajor.setText(rs.getString("maj"));
                tfsemester.setText(rs.getString("sem"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        cstdIDno.addItemListener(new ItemListener() { //When student ID in drop down changed for data to be changed
            public void itemStateChanged(ItemEvent ie) {
                try {
            Conn c = new Conn();
            String query = "select * from student where stdID ='"+cstdIDno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelId.setText(rs.getString("stdID"));
                tfphone.setText(rs.getString("phone"));
                labelgender.setText(rs.getString("gen"));
                tfnationality.setText(rs.getString("nationality"));
                tfemail.setText(rs.getString("email"));
                tftype.setText(rs.getString("tp"));
                tfcollege.setText(rs.getString("col"));
                tfenrollment.setText(rs.getString("enr"));
                tfmajor.setText(rs.getString("maj"));
                tfsemester.setText(rs.getString("sem"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        });

        update = new JButton("Update");
        update.setBounds(250,500,120,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        update.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(450,500,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);



        setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent ae) {
        //to return the exact component
        if (ae.getSource() == update ) {
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String nationality = tfnationality.getText();
            String tp = (String) tftype.getText();
            String col = (String) tfcollege.getText();
            String enr = (String) tfenrollment.getText();
            String maj = (String) tfmajor.getText();
            String sem = (String) tfsemester.getText();

            //cuz mysql is an external entity
            try {
            // Build the query string
            String query = "insert into student values('" + name + "','" + fname + "','" + stdID + "','" + phone + "','" + email + "','" + nationality + "','" + gen + "','" + tp + "','" + col + "','" + enr + "','" + maj + "','" + sem + "')";

            Conn con = new Conn();
            con.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
            setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new UpdateStudent();
    }

}
