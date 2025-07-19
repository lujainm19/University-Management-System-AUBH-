package universitymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateTeacher extends JFrame implements ActionListener{

    JTextField tfname, tflname, tfId, tfphone, tfemail, tfnationality;
    JComboBox<String> gender, des, college, emptp;
    JButton submit, cancel;

    UpdateTeacher(){
        //frame size, location and visibility
        setSize(900, 700);
        setLocation(500, 200);

        setLayout(null);
        
        //New Faculty Details heading
        JLabel heading = new JLabel("New Faculty Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        //Name: heading
        JLabel lblname = new JLabel("Name:");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        //Last Name: heading
        JLabel lbllname = new JLabel("Last Name:");
        lbllname.setBounds(400, 150, 200, 30);
        lbllname.setFont(new Font("serif", Font.BOLD, 20));
        add(lbllname);

        tflname = new JTextField();
        tflname.setBounds(600, 150, 150, 30);
        add(tflname);

        //Employee ID: heading
        JLabel lblId = new JLabel("Employee ID:");
        lblId.setBounds(50, 200, 200, 30);
        lblId.setFont(new Font("serif", Font.BOLD, 20));
        add(lblId);

        tfId = new JTextField();
        tfId.setBounds(200, 200, 150, 30);
        add(tfId);

        //Phone No. : heading
        JLabel lblphone = new JLabel("Phone No. :");
        lblphone.setBounds(400, 200, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 200, 150, 30);
        add(tfphone);

        //Email: heading
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(50, 250, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 250, 150, 30);
        add(tfemail);

        //Nationality: heading
        JLabel lblnationality = new JLabel("Nationality:");
        lblnationality.setBounds(400, 250, 200, 30);
        lblnationality.setFont(new Font("serif", Font.BOLD, 20));
        add(lblnationality);

        tfnationality = new JTextField();
        tfnationality.setBounds(600, 250, 150, 30);
        add(tfnationality);
        
        //Gender: heading
        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(50, 300, 200, 30);
        lblgender.setFont(new Font("serif", Font.BOLD, 20));
        add(lblgender);

        String gen[] = {"Male", "Female", "Prefer not to say"};
        gender = new JComboBox<>(gen);
        gender.setBounds(200, 300, 150, 30);
        gender.setBackground(Color.WHITE);
        add(gender);

        //Designation: heading
        JLabel lbldes = new JLabel("Designation: ");
        lbldes.setBounds(400, 300, 200, 30);
        lbldes.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldes);

        String d[] = {"Assistant Proffesor", "Lecturer"};
        des = new JComboBox<>(d);
        des.setBounds(600, 300, 150,30);
        des.setBackground(Color.WHITE);
        add(des);

        //College Dept.:  heading
        JLabel lblcollege = new JLabel("College Dept. :");
        lblcollege.setBounds(50, 350, 200, 30);
        lblcollege.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcollege);

        String col[] = {"Arts & Sciences", "Business & Management", "Engineering & Computing", "Media & Design"};
        college = new JComboBox<>(col);
        college.setBounds(200, 350, 150, 30);
        college.setBackground(Color.WHITE);
        add(college);

        //Employement Type: heading
        JLabel lblemptp = new JLabel("Employement Type:");
        lblemptp.setBounds(400, 350, 200, 30);
        lblemptp.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemptp);

        String emp[] = {"Full-time", "Part-time"};
        emptp = new JComboBox<>(emp);
        emptp.setBounds(600, 350, 150, 30);
        emptp.setBackground(Color.WHITE);
        add(emptp);

       

        submit = new JButton("Submit");
        submit.setBounds(250,550,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450,550,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);



        setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent ae) {
        //to eturn the exact component
        if (ae.getSource() == submit ) {
            String name = tfname.getText();
            String lname = tflname.getText();
            String empID = tfId.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String nationality = tfnationality.getText();
            String gen = (String) gender.getSelectedItem();
            String d = (String) des.getSelectedItem();
            String col = (String) college.getSelectedItem();
            String emp = (String) emptp.getSelectedItem();
    
            //cuz mysql is an external entity
            try {
            // Build the query string
            String query = "insert into faculty values('" + name + "','" + lname + "','" + empID + "','" + phone + "','" + email + "','" + nationality + "','" + gen + "','" + d + "','" + col + "','" + emp + "')";

            Conn con = new Conn();
            con.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Faculty Details Inserted Successfully");
            setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new UpdateTeacher();
    }
    


}
