import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;  

public class AfficheDateClass implements IJournal{

	private static String Csender;

	public static void setSender(String Name)
	{
		Csender = Name;
	}

@Override
	public void outPut_Msg(String message) {
//a
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  

	    LocalDateTime now = LocalDateTime.now(); 
		System.out.println(message);
		System.out.println("A ete genere par la class : " + Csender + " ");
		System.out.println("la date: " + dtf.format(now));
	}
}