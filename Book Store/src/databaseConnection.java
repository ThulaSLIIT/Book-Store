
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author W3 Computers
 */
public class databaseConnection {

    static Connection connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");
            return con;
            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
