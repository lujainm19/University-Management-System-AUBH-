import javax.swing.*;

//to create a frame screen
public class Splash extends JFrame{

    Splash(){

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
