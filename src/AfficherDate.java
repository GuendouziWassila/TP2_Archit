import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AfficherDate implements IJournal{

    private static String className;

    @Override
    public void outPut_Msg(String message) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);

        System.out.println(message + " : generated on " + formattedDate + " from " + className);
    }

    public static void setClassName(String ClassName) { className = ClassName;}
}
