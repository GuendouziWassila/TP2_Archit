import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class message_fichier extends message_composant {
	
	@Override
	public void outPut_Msg (String message) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	try {

		   File file = new File("message.txt");

	
		    file.createNewFile(); //le fichier va contenire tous les execution de l'application
		   
	       FileWriter fw = new FileWriter(file,true);
		   BufferedWriter bw = new BufferedWriter(fw);
		   bw.write(message+"......."+dtf.format(LocalDateTime.now())+"\n");
		   bw.close();
		  } catch (IOException e) {
		   e.printStackTrace();}}}


