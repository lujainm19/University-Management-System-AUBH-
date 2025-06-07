package universitymanagementsystem;

public class Conn {

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
