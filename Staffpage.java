
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arisa
 */
public class Staffpage {
    String settings;
    String add;
    String terminate;
    String Edit;
    

    private SimpleDateFormat sdf;
    private Calendar calendar;
    
    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTerminate() {
        return terminate;
    }

    public void setTerminate(String terminate) {
        this.terminate = terminate;
    }

    public String getEdit() {
        return Edit;
    }

    public void setEdit(String Edit) {
        this.Edit = Edit;
    }

   
    //DATE AND TIME
     public void main(){
         calendar = Calendar.getInstance();
         sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     }
     String time = sdf.format(calendar.getTime());
}
