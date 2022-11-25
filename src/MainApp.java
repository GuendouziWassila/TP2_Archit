import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		


		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
