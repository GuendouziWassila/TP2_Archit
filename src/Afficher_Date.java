import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Afficher_Date implements IJournal {


		
		@Override
		public void outPut_Msg(String message) {
			
			
			Date current = new Date (0);
			
			DateFormat date_format = new SimpleDateFormat("yyyy//MM/dd HH:mm:s");
			
			String Date = date_format.format(current);
			
			System.out.println(message);
			
			System.out.println(Date);

			

		}
	}
