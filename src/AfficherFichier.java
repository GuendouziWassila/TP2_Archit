import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class AfficherFichier implements IJournal {

    @Override
    public void outPut_Msg(String message) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt", true);
            myWriter.write(message +  "\r\n");
            myWriter.close();

            System.out.println("Successfully wrote the message to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
