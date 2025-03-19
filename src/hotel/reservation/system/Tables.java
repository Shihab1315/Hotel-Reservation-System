
package hotel.reservation.system;
import java.sql.*;
import javax.swing.JOptionPane;

public class Tables {
    public static void main(String[]args){
        Connection con=null;
        Statement st=null;
        try{
            con = connectionDB.getCon();
            st=con.createStatement();
            st.executeUpdate(" create table users(name varchar(200),email varchar(200),password varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            try{
            con.close();
            st.close();
        }catch(Exception ex){
            
        }
        }
    }
}
