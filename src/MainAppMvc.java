import java.sql.SQLException;
import Interface.IJournal;
import Interface.IEtudiant;
import Interface.IEtudRepo;
import Interface.IUnivRepo;
import Class.AfficheComposite;
import Class.AfficheEcran;
import Class.AfficheFichier;
import Class.AfficheDateClass;
import Class.EtudiantRepository;
import Class.UniversiteRepository;
import Class.EtudiantService;
import Class.Etudiant;
import Class.ViewInscription;

public class MainAppMvc {

	public static void main(String[] args) {

		AfficheComposite comp = new AfficheComposite();
		
		IJournal Ecran = new AfficheEcran();
		IJournal Fichier = new AfficheFichier();
		IJournal DateClass = new AfficheDateClass();
		
		comp.ajouter(Ecran);
		comp.ajouter(Fichier);
		comp.ajouter(DateClass);
		
		IEtudRepo StudRep = new EtudiantRepository(comp);
		IUnivRepo UnivRep= new UniversiteRepository(comp);
		EtudiantService serv=new EtudiantService(StudRep, UnivRep, comp);
		
		IEtudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		ViewInscription v = new ViewInscription();
		v.Show_Inscription();
		try {
			serv.inscription(etudiant);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}