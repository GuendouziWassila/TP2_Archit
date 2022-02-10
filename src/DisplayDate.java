import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDate implements IJournal {

	@Override
	public void outPut_Msg(String message) {
		
		 SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		    Date date = new Date();
		    System.out.println(message + "\n" +"générer par la classe: "+ this. getClass(). getName() +" , "+"Le : "+d.format(date));
		
	}

}
