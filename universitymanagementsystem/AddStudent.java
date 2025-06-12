package universitymanagementsystem;
import javax.swing.*;

//to create a frame
public class AddStudent extends JFrame{

    AddStudent(){
        //frame size, location and visibility
        setSize(900, 700);
        setLocation(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddStudent();
    }

}
