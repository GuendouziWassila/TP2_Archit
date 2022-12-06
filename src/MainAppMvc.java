import java.sql.SQLException;

public class MainAppMvc {

	public static void main(String[] args) throws SQLException {
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