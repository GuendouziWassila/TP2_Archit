import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		IDBConnexion conn = DBConnection.getInstance();
		Composite comp = new Composite();
		
		Etudiant etudiant0 =new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1,0,0);
		
		IJournal j1 = new AfficherEcran();
		IJournal j2 = new AfficherDate();
		IJournal j3 = new AfficherFile();
		
		comp.add(j1);
		comp.add(j2);
		comp.add(j3);
		
		IEtudiantRepository ETUDUNIVR = new EtudiantRepository(conn, comp);
		IUniversiteRepository UnivRep = new UniversiteRepository(conn, comp);
    	
		EtudiantService serv = new EtudiantService(ETUDUNIVR ,UnivRep, comp);
		try {
			serv.inscription(etudiant0, 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
