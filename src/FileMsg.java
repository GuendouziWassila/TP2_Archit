import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.PrintStream;  

public class FileMsg implements IJournal  {

    //File file = new File("C:/Users/Asus-U/Desktop/Archi2/TP2_Archit/src/A.txt");
    
    static PrintStream o;
   // FileMsg(PrintStream o){
     // this.o =o;
                        //  }



    //FileOutputStream i=new FileOutputStream(file);  
    

    @Override
    public void outPut_Msg(String message) {
       
    try {
        if(o == null){
        o = new PrintStream(new File("C:/Users/Asus-U/Desktop/Archi2/TP2_Archit/src/A.txt"));
        }
        else {
        PrintStream console = System.out;
       System.setOut(o);
       System.out.println(message);
       System.setOut(console);}
        }
    
     catch (FileNotFoundException e) {
    
        e.printStackTrace();
    }}}

     
    
   
    

