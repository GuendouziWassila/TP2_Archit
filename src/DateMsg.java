import java.time.LocalDate;

public class DateMsg implements IJournal{
        
    
    @Override
    public void outPut_Msg(String message) {
        LocalDate myObj = LocalDate.now();
        System.out.println(message+" Date: "+myObj);
    }

    
} 