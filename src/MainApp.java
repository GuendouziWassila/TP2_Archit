



import java.sql.SQLException;


import DB.DBConnection;
import Journal.AfficherMessEcran;
import Journal.AfficherMessFichier;
import Journal.DateMess;
import Journal.MessComposite;
import Repository.EtudiantRepository;
import Repository.InterfaceDBConnection;
import Repository.UniversiteRepository;
import Services.Etudiant;
import Services.EtudiantService;
import Services.IJournal;
import Services.InterfaceEtudeRep;
import Services.InterfaceEtudiant;
import Services.InterfaceUnivRep;

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
	    InterfaceEtudiant stud = new Etudiant(4, "Guendouziiiii", "wassila", "guen4@gmail.com","xxxx", 2);
		EtudiantService serv=new EtudiantService(StudRep,UnivRep,a);
		serv.inscription(stud);
		
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
