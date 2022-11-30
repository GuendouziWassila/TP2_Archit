import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.OutputStream;  
import java.io.PrintStream;  

public class FileMsg implements IJournal    {

    //File file = new File("C:/Users/Asus-U/Desktop/Archi2/TP2_Archit/src/A.txt");
    
    
    



    //FileOutputStream i=new FileOutputStream(file);  
    
PrintStream o;



    @Override
    public void outPut_Msg(String message) {
       
    try {
        o = new PrintStream(new File("C:/Users/Asus-U/Desktop/Archi2/TP2_Archit/src/A.txt"));
        System.setOut(o);
       System.out.println(message);
    } catch (FileNotFoundException e) {
    
        e.printStackTrace();
    }
       
     
    }
   
    
}
