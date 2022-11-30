import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		


		IEtudiantServ serv=new EtudiantService();
		try {
			serv.inscription(6, "MAATLIA", "Mohamed", "nazimmizo7@gmail.com","xxxx", 123);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
