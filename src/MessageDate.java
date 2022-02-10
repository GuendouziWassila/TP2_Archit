import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageDate implements IJournal{
	@Override
	public void outPut_Msg (String message) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	     System.out.println(message + ", La date : "+dtf.format(LocalDateTime.now()));
		
	}

}
