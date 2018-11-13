import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//bean imports
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.JOptionPane;
import static org.jboss.logging.NDC.clear;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 101484
 */
@ManagedBean(name = "Applicant")
@RequestScoped
public class Applicant extends Recruitment {
    String email;
    String password;
 Component rootPane;
    //DB Connection
     DBCONNECT db = new DBCONNECT();
    Connection mycon = db.myConnect();
    Hasher jk = new Hasher();//password hashing class calling
    //getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //login validation
    private String login() throws SQLException{
     Statement statement = mycon.createStatement();
    String SQL = "SELECT Email,Password FROM applicant WHERE Email = '" +getEmail()+
            "' AND Password = '" + getPassword() + "';";
    ResultSet resultset = statement.executeQuery(SQL);
    while (resultset.next()){
        if(getEmail().equals(resultset.getString("Email")) && getPassword().equals(resultset.getString("Password"))){
            return "index";
        }
                return null;
    }
        return null;
    }
    
    
    //checking if applicant has met requirements
    public String apply() throws SQLException{
        Statement statement = mycon.createStatement();
        String SQL = "SELECT Age,Gender,Achievements,Educaion FROM prerequisite WHERE Age = '" +getAge()+
            "' AND Achievements = '" + getAchievements() + "';" + "' AND Education = '" + getEducation();
         
        ResultSet resultset = statement.executeQuery(SQL);
       boolean recordAdded = true;
    while (resultset.next()){
        
        
       recordAdded = true;
    }
    if( recordAdded ){
            
      JOptionPane.showMessageDialog(rootPane, "Record added");
    }else{
       JOptionPane.showMessageDialog(rootPane, "Record already exists");
    }
        return null;
        
    }
    public String saveUser()throws SQLException{
       
        Statement s = null ;
        
        if(mycon!=null){
         System.out.println(mycon);
         s = mycon.createStatement();
         
                    String sql = "INSERT INTO applicant "
                            + "(Email,Password,Age,Gender,Achievements,"
                            + "Education) "
                            + "VALUES ('" + getEmail() + "','"
                            + jk.encryptPassword(getPassword()) + "','"
                            + getAge()+ "'" + ",'"
                            + getGender() + "','"
                            + getAchievements()+ "','"    
                            + getEducation()+ "') ";
                    
                    s.execute(sql);
                    clear();
                    
     }
        return null;
    }
}

  