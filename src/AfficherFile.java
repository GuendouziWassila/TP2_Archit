import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



public class AfficherFile implements IJournal {
	public void outPut_Msg(String message) {
		

		FileWriter file_writer= null;
		BufferedWriter buffere_writer= null;
		PrintWriter out = null;
		try {
		    file_writer= new FileWriter("file.txt", true);
		    buffere_writer= new BufferedWriter(file_writer);
		    out = new PrintWriter(buffere_writer);
		    out.println(message);
		    out.close();
		} catch (IOException e) {}
		
		
		finally {
		    if(out != null)
			    out.close();
		    try {
		        if(buffere_writer!= null)
		        	buffere_writer.close();
		    } catch (IOException e) { }
		    
		    try {
		        if(file_writer!= null)
		        	file_writer.close();
		    } catch (IOException e) { }
		}

	}
		
}

