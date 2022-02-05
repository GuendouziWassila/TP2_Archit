import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		InterfaceDBConnection DB = DBConnection.getInstanceDB();

        AffichageComposite AffichageListes = new AffichageComposite();
        IJournal AffichageEcran = new AffichageEcran("Message");
        IJournal AffichageDate = new AffichageDate();
        IJournal AffichageFile = new AffichageFile();

        AffichageListes.addAffichage(AffichageFile);
        AffichageListes.addAffichage(AffichageEcran);
        AffichageListes.addAffichage(AffichageDate);
        AffichageListes.outPut_Msg("This message will display three times in differents way");

        InterfaceEtudiantRepository etudiantRepository = new EtudiantRepository(DB, AffichageListes);
        InterfaceUniversiteRepository universiteRepository = new UniversiteRepository(DB, AffichageListes);
        InterfaceEtudiantService serv=new EtudiantService(etudiantRepository,universiteRepository, AffichageListes);

        Etudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com", "xxxx", 1);
        InterfaceUniversite universite = new Universite(2,"Benyoucef Ben Khedda",TypePackage.Standard);

        ViewInscription V = new ViewInscription(etudiantRepository);
        try {
            serv.inscription(etudiant,universite, etudiantRepository);
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
