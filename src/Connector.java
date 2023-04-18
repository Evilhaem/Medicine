import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    static Connection instance;
    static String username = "root";
    static String password = "B10n24p300859609.@";

    public static Connection getInstance() {
        if(instance==null){
            try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_medicine?" + "user=" + username + "&password=" + password);
            } catch (SQLException ex) {
                Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instance;
    }
}