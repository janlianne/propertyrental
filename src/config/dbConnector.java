/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author JULIANNE
 */
public class dbConnector {
    
    private Connection connect;
    public dbConnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testapp_rent", "root", "");
            }catch(SQLException ex){
                     System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
public ResultSet getData(String sql) throws SQLException{
     Statement stmt = connect.createStatement();
     ResultSet rst = stmt.executeQuery(sql);
     return rst;

             }
public boolean insertData(String sql){
    try{
        PreparedStatement pst = connect.prepareStatement(sql);
        pst.executeUpdate();
        System.out.println("Inserted Successfully!");
        pst.close();
        return true;
    }catch(SQLException ex){
        System.out.println("Connection Error::"+ex);
        return false;
    }
}

public void deleteData(int id, String table) {
    try {
        String deleteQuery = "";
        switch (table) {
            case "tbl_property":
                deleteQuery = "DELETE FROM tbl_property WHERE u_id = ?";
                break;
                
            case "tbl_rent":
                deleteQuery = "DELETE FROM tbl_rent WHERE r_id = ?";
                break;
                  case "tbl_propertyrent":
                deleteQuery = "DELETE FROM tbl_propertyrent WHERE p_id = ?";
                break;
            default:
                System.out.println("Invalid table name for deletion.");
                return;
        }

        PreparedStatement pst = connect.prepareStatement(deleteQuery);
        pst.setInt(1, id);

        int rowsDeleted = pst.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Deleted Successfully!");
        } else {
            System.out.println("Deletion Failed!");
        }

        pst.close();
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex.getMessage());
    }
}
 public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
 }
}


        
    
