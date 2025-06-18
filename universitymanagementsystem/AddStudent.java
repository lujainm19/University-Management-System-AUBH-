package universitymanagementsystem;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;

//to create a frame
public class AddStudent extends JFrame implements ActionListener{

    JTextField tfname, tffname, tfId, tfphone, tfemail, tfnationality;
    JComboBox<String> gender, type, college, enrollment, major, semester;
    JButton submit, cancel;

    AddStudent(){
        //frame size, location and visibility
        setSize(900, 700);
        setLocation(500, 200);

        setLayout(null);
        
        //New Student Details heading
        JLabel heading = new JLabel("New Student Details");
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

         //Father's Name: heading
        JLabel lblfname = new JLabel("Father's Name:");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        //Student ID: heading
        JLabel lblId = new JLabel("Student ID:");
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

        //Student Email: heading
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

        //Student Type: heading
        JLabel lbltype = new JLabel("Student Type:");
        lbltype.setBounds(400, 300, 200, 30);
        lbltype.setFont(new Font("serif", Font.BOLD, 20));
        add(lbltype);

        String tp[] = {"Undergraduate", "Post-graduate", "Foundation"};
        type = new JComboBox<>(tp);
        type.setBounds(600, 300, 150,30);
        type.setBackground(Color.WHITE);
        add(type);

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

        //Enrollmenent Status: heading
        JLabel lblenrollment = new JLabel("Enrollmenent Status:");
        lblenrollment.setBounds(400, 350, 200, 30);
        lblenrollment.setFont(new Font("serif", Font.BOLD, 20));
        add(lblenrollment);

        String enr[] = {"Full-time", "Part-time"};
        enrollment = new JComboBox<>(enr);
        enrollment.setBounds(600, 350, 150, 30);
        enrollment.setBackground(Color.WHITE);
        add(enrollment);

        //Major:  heading
        JLabel lblmajor = new JLabel("Major:");
        lblmajor.setBounds(50, 400, 200, 30);
        lblmajor.setFont(new Font("serif", Font.BOLD, 20));
        add(lblmajor);

        String m[] = {"Arts & Sciences", "Digital Marketing", "Finance", "Human Resource Management", "Management", "MBA", "Civil Engineering", "Computer Engineering", "Computer Science", "Cybersecurity", "Industrial Engineering", "Mechanical Engineering", "Software Engineering", "Data Science & AI", "Engineering Management", "Multimedia Design"};
        major = new JComboBox<>(m);
        major.setBounds(200, 400, 150, 30);
        major.setBackground(Color.WHITE);
        add(major);

        //Semester: heading
        JLabel lblsemester = new JLabel("Semester:");
        lblsemester.setBounds(400, 400, 200, 30);
        lblsemester.setFont(new Font("serif", Font.BOLD, 20));
        add(lblsemester);

        String sem[] = {"1", "2", "3", "4", "5", "6", "7", "8", "other"};
        semester = new JComboBox<>(sem);
        semester.setBounds(600, 400, 150, 30);
        semester.setBackground(Color.WHITE);
        add(semester);

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

        } else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new AddStudent();
    }

}
