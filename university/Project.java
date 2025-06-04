import javax.swing.*;
import java.awt.*;

public class Project extends JFrame{

    Project() {
        setSize(1925,1050);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/aubh.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1925, 975, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);

        setVisible(true);

    }

    public static void main(String[] args){
        new Project();
    }

}
