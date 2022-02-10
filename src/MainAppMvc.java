



import java.sql.SQLException;

import DB.DBConnection;
import Journal.AfficherMessEcran;
import Journal.AfficherMessFichier;
import Journal.DateMess;
import Journal.MessComposite;
import Repository.EtudiantRepository;
import Repository.InterfaceDBConnection;
import Repository.UniversiteRepository;
import Services.EtudiantService;
import Services.IJournal;
import Services.InterfaceEtudeRep;
import Services.InterfaceUnivRep;
import controleur.AbstractViewInscription;
import controleur.ControleurInscription;
import view.ViewInscription;

public class MainAppMvc {

	public static void main(String[] args) throws SQLException {
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
		EtudiantService serv=new EtudiantService(StudRep,UnivRep,a);
		AbstractViewInscription f = new ViewInscription();
		ControleurInscription d = new ControleurInscription(f, serv);
		f.registre(d);	
		f.addListener();

	}

}
