
package hotel.reservation.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class connectionDB {
    public Connection con;
    public Statement statement;

    public connectionDB() {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entities", "root", "#106555*MIRAz*#!");
           
            statement = con.createStatement();
            System.out.println("Database Connected Successfully!");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Database Connection Failed!");
        }
    }

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/entities", "root", "#106555*MIRAz*#!");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    Object Statement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

    
