import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		InterfaceDBConnection db = DBConnection.getInstance();
		InterfaceEtudeRep StudRep= new EtudiantRepository(db);
	    InterfaceUnivRep UnivRep= new UniversiteRepository(db);
	    InterfaceEtudiant stud = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		EtudiantService serv=new EtudiantService(StudRep,UnivRep);
			serv.inscription(stud);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
