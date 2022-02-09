import java.sql.SQLException;

public class MainApp {

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
		
		try {
			serv.inscription(etudiant);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}