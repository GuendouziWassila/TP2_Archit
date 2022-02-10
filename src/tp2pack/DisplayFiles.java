package tp2pack;
import java.io.FileWriter;
import java.io.IOException;

public class DisplayFiles implements IJournal {

	@Override
	public void outPut_Msg(String message) {
		
		try { 
	    	  FileWriter fw = new FileWriter("C:\\Users\\kcpc\\Desktop\\M1_ISII\\AL\\TP\\TP2\\file.txt");
	    	  fw.write(message);
	    	  fw.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	     
	}
	
		
	}

}
