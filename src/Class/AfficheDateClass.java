package Class;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;
import Interface.IJournal;

public class AfficheDateClass implements IJournal{
	
	private static String Csender;
	
	public static void setSender(String Name)
	{
		Csender = Name;
	}
	
	@Override
	public void outPut_Msg(String message) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  

	    LocalDateTime now = LocalDateTime.now(); 
		System.out.println(message);
		System.out.println("A été généré par la class : " + Csender + " ");
		System.out.println("À la date: " + dtf.format(now));
	}
}