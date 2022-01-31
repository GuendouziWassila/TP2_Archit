import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		AffichageComposite AffichageListes = new AffichageComposite();
		IJournal AffichageEcran = new AffichageEcran();
		IJournal AffichageDate = new AffichageDate();
		IJournal AffichageFile = new AffichageFile();

		AffichageListes.addAffichage(AffichageFile);
		AffichageListes.addAffichage(AffichageEcran);
		AffichageListes.addAffichage(AffichageDate);
		AffichageListes.outPut_Msg("This message will display three times in differents way");
		InterfaceEtudiantRepository etudiantRepository = new EtudiantRepository();
		InterfaceUniversiteRepository universiteRepository = new UniversiteRepository();
		InterfaceEtudiantService serv=new EtudiantService(etudiantRepository,universiteRepository);
		Etudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com", "xxxx", 1);
		InterfaceUniversite universite;
		serv.inscription(etudiant,universite, etudiantRepository);
	}

}
