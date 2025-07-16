package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{

    Project() {
        setSize(1925,1050);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/aubh.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1925, 975, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);

        //to add a menu bar
        JMenuBar mb = new JMenuBar();

        //to add New Information heading on the menu Bar
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);

        //to add Menu Items under heading on menu bar
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        //to add New Student Information under New Information
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);



        //Details
        JMenu details  = new JMenu("View Details");
        details.setForeground(Color.BLUE);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Information");
        facultydetails.setBackground(Color.WHITE);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Information");
        studentdetails.setBackground(Color.WHITE);
        details.add(studentdetails);
        


        //Leave
        JMenu leave  = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        leave.add(studentleave);


        //Leave Details
        JMenu leaveDetails  = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLUE);
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(studentleavedetails);


        //Examination
        JMenu exam  = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        exam.add(examinationdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        exam.add(entermarks);


        //Update Details
        JMenu updateInfo  = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLUE);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updateInfo.add(updatestudentinfo);



        //Fee
        JMenu fee  = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Student Fee Structure");
        feestructure.setBackground(Color.WHITE);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        fee.add(feeform);


        //Exit to exit project
        JMenu exit  = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        //to call actionPerformed method when clicked on exit to then close the frame
        ex.addActionListener(this);;
        exit.add(ex);



        setJMenuBar(mb);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     String msg = ae.getActionCommand();

    if (msg.equals("Exit")) {
        setVisible(false);
    } else if (msg.equals("New Faculty Information")) {
        new AddTeacher();  
    } else if (msg.equals("New Student Information")) {
        new AddStudent();
        }
    }

    public static void main(String[] args){
        new Project();
    }

}
