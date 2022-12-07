import java.time.LocalDateTime;

public class DateMsg implements IJournal{
        
    
    @Override
    public void outPut_Msg(String message) {
        //LocalDate myObj = LocalDate.now();
        // System.out.println(message+" Date: "+myObj);

        LocalDateTime myObj = LocalDateTime.now();
		
		System.out.println(message);
		
		System.out.println(myObj);
    }

    
} 