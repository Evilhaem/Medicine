import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    static Connection instance;

    public static Connection getInstance() {
        if(instance==null){
            try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_medicine?" + "user=root&password=B10n24p300859609.@");
            } catch (SQLException ex) {
                Logger.getLogger(PillFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instance;
    }
}