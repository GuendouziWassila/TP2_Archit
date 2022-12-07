import java.text.SimpleDateFormat;
import java.util.Date;
public class AfichMsgDate implements IJournal {
	public void outPut_Msg(String message) {
		 Date date = new Date();
         SimpleDateFormat d =  new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
         System.out.println(d.format(date));
         System.out.println(message);
		   }
}
