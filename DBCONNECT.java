import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 101484
 */
public class DBCONNECT {
    public DBCONNECT(){
    }
        
        public Connection myConnect(){
            Connection connect = null;
            
            try{
                Class.forName("com.mysql.jdbc.Driver");

                    connect = DriverManager.getConnection(""
                            + "jdbc:mysql://localhost/jobrecruitment"
                            + "?user=root&password=");
    
            }
            catch(ClassNotFoundException | SQLException e){
                System.out.println("Cannot connect to Property DB"+e.getMessage());
            }
            return connect;
        }
        public static void main(String args[]){
            DBCONNECT test = new DBCONNECT();
            test.myConnect();
        }
    }

