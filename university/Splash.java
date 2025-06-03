import javax.swing.*;
import java.awt.*;

//to create a frame screen
public class Splash extends JFrame{

    Splash(){
        
        //to add a picture to background of frame create object of it and add 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/aubh.jpg"));
        //to scale the image properly on the frame
		Image i2 = i1.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);

        //to set the location of the frame on the screen
        setLocation(450,150);
        //to set the sixe of the frame
        setSize(1000,700);
        //the screen is not visible so set to true to make it visible
		setVisible(true);
    }

    public static void main(String[] args) {
        new Splash();
    }
}
