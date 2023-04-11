import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    static Connector instance;
    String url = "jdbc:mysql://localhost:3306/Medicine";
    String username = "java";
    String password = "B10n24p300859609.@";
    Connection connection;

    static java.sql.Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public static Connection getInstance() {
        try {
            if(instance==null){
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_medicine?" + "user=root&password=B10n24p300859609.@");
                instance = new Connector();
            }
            return conn;

        } catch (SQLException ex) {
            Logger.getLogger(PillFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}