import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Afficher_File implements IJournal {
	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		
		FileWriter file_writer= null;
		BufferedWriter buffere_writer= null;
		PrintWriter out = null;
		try {
		    file_writer= new FileWriter("myfile.txt", true);
		    buffere_writer= new BufferedWriter(file_writer);
		    out = new PrintWriter(buffere_writer);
		    out.println("the text");
		    out.close();
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
		finally {
		    if(out != null)
			    out.close();
		    try {
		        if(buffere_writer!= null)
		        	buffere_writer.close();
		    } catch (IOException e) {
		        //exception handling left as an exercise for the reader
		    }
		    try {
		        if(file_writer!= null)
		        	file_writer.close();
		    } catch (IOException e) {
		        //exception handling left as an exercise for the reader
		    }
		}
		
	}
	
	
}
