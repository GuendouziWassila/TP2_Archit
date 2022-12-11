import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Interface.IJournal;

import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

public class  FichierJournal implements IJournal{

  @Override
  public void outPut_Msg(String message) {
    
    FileWriter fw = null;
			BufferedWriter bw = null;
			PrintWriter out = null;

			try {
			    fw = new FileWriter("log.txt", true);
			    bw = new BufferedWriter(fw);
			    out = new PrintWriter(bw);
			    out.println(message);
			    out.close();
			}
			catch (IOException e) {}

			finally 
			{
			    if(out != null)
				    out.close();
			    try {
			        if(bw != null)
			            bw.close();
			    }
		    catch (IOException e) {}

		    try 
			    {
			        if(fw != null)
			            fw.close();
			    }
			catch (IOException e) {}
		    
			}
		}
    
  }
  
}