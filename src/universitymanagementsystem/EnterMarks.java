package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame{

    Choice cstdIDno;
    JComboBox cbsemester;

    EnterMarks(){

        setSize(1100, 600);
        setLocation(400,250);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        //exam image 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
        image.setBounds(570, 70, 450, 350);
		add(image);

        //Enter Marks of Student heading
        JLabel heading = new JLabel("Enter Marks of Student");
        heading.setBounds(50, 0, 500, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        //Search by Student ID heading
        JLabel lblstdIDnumber = new JLabel("Select Student ID");
        lblstdIDnumber.setBounds(50, 70, 150, 20);
        add(lblstdIDnumber);

        cstdIDno = new Choice();
        cstdIDno.setBounds(200, 70, 150, 20);
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

        //Select Semester heading dropdown
        JLabel lblsemester = new JLabel("Select Semester");
        lblsemester.setBounds(50, 110, 150, 20);
        add(lblsemester);

        String semester[] = {"1st Semester", "2snd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester"};
        cbsemester = new JComboBox<>(semester);
        cbsemester.setBounds(200, 110, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);


        setVisible(true);

    }

public static void main(String[] args) {
    new EnterMarks();
}

}
