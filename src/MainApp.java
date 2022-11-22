import java.sql.SQLException;
import java.sql.*;

public class MainApp {

	public static void main(String[] args) {
		
		EtudiantService serv=new EtudiantService();
		serv.setEtudRep(new EtudiantRepository());
		serv.setUnivRep(new UniversiteRepository());
		try {

		serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1);
	} catch (Exception e) {
		e.printStackTrace();
		
	}

}


		


			
		
	}
