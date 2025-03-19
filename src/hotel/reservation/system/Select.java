
package hotel.reservation.system;
import java.sql.*;
import javax.swing.JOptionPane;

public class Select {
    public static ResultSet getData(String query){
        Connection con;
        con = null;
        Statement st=null;
        ResultSet rs=null;
        try{
            con=connectionDB.getCon();
            st=con.createStatement();
            rs =st.executeQuery(query);
            return rs;
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, ex);
            return null;
        }
        }
        
        
}
