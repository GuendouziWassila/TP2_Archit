import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateMsg implements IJournal{
        
    
    @Override
    public void outPut_Msg(String message) {
        //LocalDate myObj = LocalDate.now();
        // System.out.println(message+" Date: "+myObj);

        Date Actuel = new Date (0);
		
		DateFormat dateformat = new SimpleDateFormat("yyyy//MM/dd HH:mm:s");
		String date = dateformat.format(Actuel);
		
		System.out.println(message);
		
		System.out.println(date);
    }

    
} 