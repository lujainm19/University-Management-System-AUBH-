package universitymanagementsystem;

import javax.swing.*;

public class Marks extends JFrame{

    String IDno;

    Marks (String IDno) {
        this.IDno = IDno;

        setSize(550,650);
        setLocation(600,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Marks("");
    }
}
