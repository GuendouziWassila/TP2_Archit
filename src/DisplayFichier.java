
import java.io.FileWriter;
import java.io.IOException;


public class DisplayFichier implements IJournal{

	@Override
	public void outPut_Msg(String message) {
		  
	    try { 
	    	  FileWriter fw = new FileWriter("C:\\Users\\pc\\Desktop\\fichier.txt");
	    	  fw.write(message);
	    	  fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	


}
