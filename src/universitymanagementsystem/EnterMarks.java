package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;

public class EnterMarks extends JFrame{

    EnterMarks(){

        setSize(1100, 600);
        setLocation(400,250);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
        image.setBounds(570, 60, 450, 350);
		add(image);

        setVisible(true);

    }

public static void main(String[] args) {
    new EnterMarks();
}

}
