import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		IDBConnection conn = DBConnection.setDBC();

		AfficherComposite composite = new AfficherComposite();

		IJournal afficherEcran = new AfficherMsg();
		IJournal afficherFichier = new AfficherFichier();
		IJournal afficherDate = new AfficherDate();

		composite.add(afficherEcran);
		composite.add(afficherFichier);
		composite.add(afficherDate);

		IEtudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1);

		IUniversiteRepository univ = new UniversiteRepository(conn, composite);
		IEtudiantRepository etud = new EtudiantRepository(conn, composite);

		EtudiantService serv=new EtudiantService(etud, univ, etudiant, composite);
		try {
			serv.inscription();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
