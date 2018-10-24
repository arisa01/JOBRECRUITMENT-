import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//bean imports
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
@ManagedBean(name = "Validate")
@RequestScoped
public class Prerequisite extends Recruitment{
    boolean results;
    String email;
    String password;
    //getters and setters
    public boolean isResults() {
        return results;
    }

    public void setResults(boolean results) {
        this.results = results;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     DBCONNECT db = new DBCONNECT();
    Connection mycon = db.myConnect();
    Hasher jk = new Hasher();
    
    //login validation
    private String login() throws SQLException{
     Statement statement = mycon.createStatement();
    String SQL = "SELECT Email,Password FROM prerequisite WHERE Email = '" +getEmail()+
            "' AND Password = '" + getPassword() + "';";
    ResultSet resultset = statement.executeQuery(SQL);
    while (resultset.next()){
        if(getEmail().equals(resultset.getString("Email")) && getPassword().equals(resultset.getString("Password"))){
            return "index";
        }
    }
        return null;
    }
    public String apply() throws SQLException{
        Statement statement = mycon.createStatement();
        String SQL = "SELECT Age,Gender,Achievement,Educaion FROM prerequisite WHERE Email = '" +getEmail()+
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
         
                    String sql = "INSERT INTO prerequisite "
                            + "(Email,Password,Age,Gender,Achievements,Education,"
                            + "Result) "
                            + "VALUES ('" + getEmail() + "','"
                            + jk.encryptPassword(getPassword()) + "','"
                            + getAge() + "','"
                            + getGender() + "','"
                            + getAchievements()+ "','"    
                            + isResults()+ "') ";
                    
                    s.execute(sql);
                    clear();
                    
     }
        return null;
    }
}
