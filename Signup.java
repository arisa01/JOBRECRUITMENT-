
import java.sql.Connection;
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
 * @author arisa
 */
@ManagedBean(name = "Staff")
@RequestScoped
public class Signup {
    String Email;
    int phone;
    String Residence;
    String Password;
    String Gender;;
    int Age;
    DBconnect db = new DBconnect();
    Connection mycon = db.myConnect();
    

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getResidence() {
        return Residence;
    }

    public void setResidence(String Residence) {
        this.Residence = Residence;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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
        return null;
    }
}
