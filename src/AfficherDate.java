import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AfficherDate implements IJournal{
	public AfficherDate() {
	}
	
	@Override
	public void outPut_Msg(String message) {
		 SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    Date date = new Date();
		    System.out.println(message);
		    System.out.println(s.format(date));

	}

}
