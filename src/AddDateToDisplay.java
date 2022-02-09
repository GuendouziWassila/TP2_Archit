import java.util.Date;
import java.text.SimpleDateFormat;

public class AddDateToDisplay implements IJournal{

	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
	    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
	    System.out.println(message + "\n" +"Afficher depuis la classe: "+ this. getClass(). getName() +", "+"Le : "+s.format(date));
	}

}
