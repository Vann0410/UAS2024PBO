package koneksi;

import com.sun.tools.jconsole.JConsoleContext;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Instant;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class koneksi {

    private static Connection koneksi;
    public static void main(String[] args) {
        Connection conn = new koneksi().Connect();
    }
    public static Connection Connect(){  
//            throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("koneksi berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println("koneksi driver gagal"+e);
        
            
        }
        try{
            String url ="jdbc:mysql://localhost:3306/db_laundry";
            String username="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi =DriverManager.getConnection(url,"root","");
            System.out.println("database berhasil di koneksikan");
        }catch (SQLException e){
            System.out.println("database gagal dikoneksikan");
        }
        return koneksi;
    }
            
    
    
//    public static Connection getkoneksi(){
//        if(koneksi == null){
//            try{
//                url="jdbc:mysql://localhost:3306/db_laundry";
//                String password="";
//        }catch(SQLException t){
//            JOptionPane.showMessageDialog(null, "error koneksinya ");
   //        }
//    }return koneksi;
//    }static Object getconnection(){
//        throw new UnsupportedOperationException("not yet implemented");
//        

//    public static Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public static PreparedStatement prepareStatement(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//        
//    }

            
              
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection abid_laundry = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_laundry","root","");
//            return abid_laundry;
//        catch (Exception e){
//                JOptionPane.showMessageDialog(null, e);
//                return null;
//        }
    }
//}


