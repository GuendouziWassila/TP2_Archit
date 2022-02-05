import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class AfficherDate implements IJournal{

    private String className;

    private AfficherDate() {}

    @Override
    public void outPut_Msg(String message) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);

        System.out.println(message + " : generated on " + formattedDate + " from " + className);
    }

    public void setClassName(String ClassName) { className = ClassName;}
}
