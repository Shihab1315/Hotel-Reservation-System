package hotel.reservation.system;


import java.sql.*;
import javax.swing.JOptionPane;
public class InsertUpdateDelete {
    public static void setData(String Query,String msg){
        Connection con=null;
        Statement st=null;
    
        try{
           con = connectionDB.getCon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""));
            JOptionPane.showConfirmDialog(null, msg);
            
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            try{
            
        }catch(Exception ex){
            
        }
}
}
}