import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		IDBConnection conn = DBConnection.setDBC();

		//AfficherComposite composite = new AfficherComposite();

		//IJournal afficherEcran = new AfficherMsg();
		//IJournal afficherFichier = new AfficherFichier();

		//composite.add(afficherEcran);
		//composite.add(afficherFichier);

		IEtudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1);

		IUniversiteRepository univ = new UniversiteRepository(conn);
		IEtudiantRepository etud = new EtudiantRepository(conn);

		EtudiantService serv=new EtudiantService(etud, univ, etudiant);
		try {
			serv.inscription();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
