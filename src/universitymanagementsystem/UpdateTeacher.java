package universitymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateTeacher extends JFrame implements ActionListener{

    JTextField tfname, tflname, tfId, tfphone, tfemail, tfnationality, tfdes, tfcollege, tfemptp;
    JButton update, cancel;
    Choice cempIDno;

    UpdateTeacher(){
        //frame size, location and visibility
        setSize(900, 650);
        setLocation(500, 200);

        setLayout(null);
        
        //New Faculty Details heading
        JLabel heading = new JLabel("Update Faculty Details");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 35));
        add(heading);

        //Search by Faculty ID heading
        JLabel lblempIDnumber = new JLabel("Select Faculty ID");
        lblempIDnumber.setBounds(50, 100, 200, 20);
        lblempIDnumber.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempIDnumber);

        cempIDno = new Choice();
        cempIDno.setBounds(250, 100, 200, 20);
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
        
        //Name: heading
        JLabel lblname = new JLabel("Name:");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelname);

        //Last Name: heading
        JLabel lbllname = new JLabel("Last Name:");
        lbllname.setBounds(400, 150, 200, 30);
        lbllname.setFont(new Font("serif", Font.BOLD, 20));
        add(lbllname);

        JLabel labellname = new JLabel();
        labellname.setBounds(600, 150, 150, 30);
        labellname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labellname);

        //Employee ID: heading
        JLabel lblId = new JLabel("Employee ID:");
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
        

        //Email: heading
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        //Designation: heading
        JLabel lbldes = new JLabel("Designation: ");
        lbldes.setBounds(400, 300, 200, 30);
        lbldes.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldes);

        tfdes = new JTextField();
        tfdes.setBounds(600, 300, 150,30);
        add(tfdes);

        //College Dept.:  heading
        JLabel lblcollege = new JLabel("College Dept. :");
        lblcollege.setBounds(50, 350, 200, 30);
        lblcollege.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcollege);

        tfcollege = new JTextField();
        tfcollege.setBounds(200, 350, 150, 30);
        tfcollege.setBackground(Color.WHITE);
        add(tfcollege);

        //Employment Type: heading
        JLabel lblemptp = new JLabel("Employment Type:");
        lblemptp.setBounds(400, 350, 200, 30);
        lblemptp.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemptp);

        tfemptp = new JTextField();
        tfemptp.setBounds(600, 350, 150, 30);
        add(tfemptp);


        // to retrieve unchangeable data from student database and display it on the frame
        try {
            Conn c = new Conn();
            String query = "select * from faculty where empID ='"+cempIDno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labellname.setText(rs.getString("lname"));
                labelId.setText(rs.getString("empID"));
                tfphone.setText(rs.getString("phone"));
                labelgender.setText(rs.getString("gen"));
                tfnationality.setText(rs.getString("nationality"));
                tfemail.setText(rs.getString("email"));
                tfdes.setText(rs.getString("d"));
                tfcollege.setText(rs.getString("col"));
                tfemptp.setText(rs.getString("emp"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        cempIDno.addItemListener(new ItemListener() { //When student ID in drop down changed for data to be changed
            public void itemStateChanged(ItemEvent ie) {
                try {
            Conn c = new Conn();
            String query = "select * from faculty where empID ='"+cempIDno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labellname.setText(rs.getString("lname"));
                labelId.setText(rs.getString("empID"));
                tfphone.setText(rs.getString("phone"));
                labelgender.setText(rs.getString("gen"));
                tfnationality.setText(rs.getString("nationality"));
                tfemail.setText(rs.getString("email"));
                tfdes.setText(rs.getString("des"));
                tfcollege.setText(rs.getString("col"));
                tfemptp.setText(rs.getString("emp"));
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
            String d = (String) tfdes.getText();
            String col = (String) tfcollege.getText();
            String emp = (String) tfemptp.getText();

            String empID = (String) cempIDno.getSelectedItem();
    
            //cuz mysql is an external entity
            try {
            // Build the query string
            String query = "UPDATE faculty SET phone='" + phone + "', email='" + email + "', nationality='" + nationality + "', d='" + d + "', col='" + col + "', emp='" + emp + "' WHERE empID='" + empID + "'";



            Conn con = new Conn();
            con.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Faculty Details Updated Successfully");
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
