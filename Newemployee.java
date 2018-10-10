//bean imports
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
 * @author arisa
 */
@ManagedBean(name = "Newemployee")
@RequestScoped
public class Newemployee {
    String Residence;
    String Department;
    int Gender;
    String Email;
     
   //db connection
    DBconnect db = new DBconnect();
    Connection mycon = db.myConnect();
    
    //getters and setters
    public String getResidence() {
        return Residence;
    }

    public void setResidence(String Residence) {
        this.Residence = Residence;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     public String saveUser()throws SQLException{
       
        Statement s = null ;
        
        if(mycon!=null){
         System.out.println(mycon);
         s = mycon.createStatement();
         
                    String sql = "INSERT INTO staff login "
                            + "(Email,Phone,Residence,Password,Age,"
                            + "Gender) "
                            + "VALUES ('" + getEmail() + "','"
                            + getPhone() + "','"
                            + getResidence()+ "'" + ",'"
                            + getPassword() + "','"
                            + getAge()+ "','"    
                            + getGender()+ "') ";
                    
                    s.execute(sql);
                    clear();
                    
     }
}
