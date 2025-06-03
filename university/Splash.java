import javax.swing.*;
import java.awt.*;

//to create a frame screen
public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        
        //to add a picture to background of frame create object of it and add 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/aubh.jpg"));
        //to scale the image properly on the frame
		Image i2 = i1.getImage().getScaledInstance(1500, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);

        t = new Thread(this);

        //the screen is not visible so add this to make it visible
		setVisible(true);
		
		// for loop to make frame small to big(increase in size) and adjust from up down, right left
		for (int i = 0; i <= 500; i+= 10) {
			//to set the exact origin or place the frame opens on the screen x,y 450, 150
			setLocation(900-(i-50), 300-(i-350));
			//to automatically set the length, width of the framing without having to extend it manually 1000, 700
			setSize(2*i, i+200);
		}
    }

    public void run() {}

    public static void main(String[] args) {
        new Splash();
    }
}
