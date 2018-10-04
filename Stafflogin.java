
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//bean imports
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import static org.jboss.logging.NDC.clear;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arisa
 */
@ManagedBean(name = "User")
@RequestScoped
public class Stafflogin {
    String email;
    String Password;
//database connection
    DBconnect db = new DBconnect();
    Connection mycon = db.myConnect();
    
    //getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
     private String login() throws SQLException{
     Statement statement = mycon.createStatement();
    String SQL = "SELECT Name,Password FROM Staff login WHERE Email = '" +getEmail()+
            "' AND Password = '" + getPassword() + "';";
    ResultSet resultset = statement.executeQuery(SQL);
    while (resultset.next()){
        if(getEmail().equals(resultset.getString("Email")) && getPassword().equals(resultset.getString("Password"))){
            return "index";
        }
    }
        return null;
  }
    
     public String saveUser()throws SQLException{
       
        Statement s = null ;
        
        if(mycon!=null){
         System.out.println(mycon);
         s = mycon.createStatement();
         
                    String sql = "INSERT INTO Staff login "
                            + "(Email,Password,"
                            + "Gender) "
                            + "VALUES ('" + getEmail() + "','"
                            + getPassword() + "','"
                            + "') ";
                    
                    s.execute(sql);
                    clear();
                    
     }
        return null;

     }
}