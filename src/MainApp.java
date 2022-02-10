import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class MainApp {

	public static void main(String[] args) throws SQLException {	
		
		InterfaceDBConnection conn = DBConnection.getinstance();


		Etudiant etudiant1 =new Etudiant(5, "Guendouziiiii", "wassila", "guennf@gmail.com","xxxx",1);
		InterfaceEtudiantRep etudRep = new EtudiantRepository(conn);
		
		InterfaceUniversiteRep univRep = new UniversiteRepository(conn);
		
		EtudiantService serv = new EtudiantService(etudRep ,univRep);

		try {
			serv.inscription(etudiant1, 1);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
