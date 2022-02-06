import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MessComposite a = new MessComposite();
			IJournal journal1 = new AfficherMessEcran();
			IJournal journal2 = new AfficherMessFichier();
			IJournal journal3 = new DateMess();
			a.ajouter(journal1);
			a.ajouter(journal2);
			a.ajouter(journal3);
		InterfaceDBConnection db = DBConnection.getInstance();
		InterfaceEtudeRep StudRep= new EtudiantRepository(db,a);
	    InterfaceUnivRep UnivRep= new UniversiteRepository(db,a);
	    InterfaceEtudiant stud = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		EtudiantService serv=new EtudiantService(StudRep,UnivRep,a);
			serv.inscription(stud);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
