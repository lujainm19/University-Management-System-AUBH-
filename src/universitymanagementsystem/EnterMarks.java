package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame{

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
        image.setBounds(570, 60, 450, 350);
		add(image);

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

        setVisible(true);

    }

public static void main(String[] args) {
    new EnterMarks();
}

}
