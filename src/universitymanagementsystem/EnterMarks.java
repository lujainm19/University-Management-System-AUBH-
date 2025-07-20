package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame{

    Choice cstdIDno;
    JComboBox cbsemester;
    JTextField tfc1, tfc2, tfc3, tfc4, tfc5, tfc6, tfmarks1, tfmarks2, tfmarks3, tfmarks4, tfmarks5, tfmarks6;

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

        //Enter Course heading 
        JLabel lblentercourse = new JLabel("Enter Course");
        lblentercourse.setBounds(130, 150, 200, 40);
        add(lblentercourse);

        //Enter Marks heading 
        JLabel lblentermarks = new JLabel("Enter Marks");
        lblentermarks.setBounds(390, 150, 200, 40);
        add(lblentermarks);

        tfc1 = new JTextField();
        tfc1.setBounds(50, 200, 250, 20);
        add(tfc1);

        tfc2 = new JTextField();
        tfc2.setBounds(50, 230, 250, 20);
        add(tfc2);

        tfc3 = new JTextField();
        tfc3.setBounds(50, 260, 250, 20);
        add(tfc3);

        tfc4 = new JTextField();
        tfc4.setBounds(50, 290, 250, 20);
        add(tfc4);

        tfc5 = new JTextField();
        tfc5.setBounds(50, 320, 250, 20);
        add(tfc5);

        tfc6 = new JTextField();
        tfc6.setBounds(50, 350, 250, 20);
        add(tfc6);


        tfmarks1 = new JTextField();
        tfmarks1.setBounds(300, 200, 250, 20);
        add(tfmarks1);

        tfmarks2 = new JTextField();
        tfmarks2.setBounds(300, 230, 250, 20);
        add(tfmarks2);

        tfmarks3 = new JTextField();
        tfmarks3.setBounds(300, 260, 250, 20);
        add(tfmarks3);

        tfmarks4 = new JTextField();
        tfmarks4.setBounds(300, 290, 250, 20);
        add(tfmarks4);

        tfmarks5 = new JTextField();
        tfmarks5.setBounds(300, 320, 250, 20);
        add(tfmarks5);

        tfmarks6 = new JTextField();
        tfmarks6.setBounds(300, 350, 250, 20);
        add(tfmarks6);


        setVisible(true);

    }

public static void main(String[] args) {
    new EnterMarks();
}

}
