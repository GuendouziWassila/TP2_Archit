package composant_pack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class message_date  extends message_composant {
	@Override
	public void outPut_Msg (String message) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(message+"......."+dtf.format(LocalDateTime.now()));
	}

}

