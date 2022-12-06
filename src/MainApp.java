import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AfficheComposite comp = new AfficheComposite();

		IJournal Ecran = new AfficheEcran();
		IJournal Fichier = new AfficheFichier();
		IJournal DateClass = new AfficheDateClass();

		comp.ajouter(Ecran);
		comp.ajouter(Fichier);
		comp.ajouter(DateClass);

		IEtudiantREPO StudRep = new EtudiantRepository(comp);
		IUnivREPO UnivRep= new UniversiteRepository(comp);
		EtudiantService serv=new EtudiantService(StudRep, UnivRep, comp);
		
		Etudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		try {
			serv.inscription(etudiant);
			//System.out.println("hello world");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
