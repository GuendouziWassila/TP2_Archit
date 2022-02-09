import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Composite comp = new Composite();

		Ijournal j1 = new AfficherEcran();
		Ijournal j2 = new AfficherDate();
		Ijournal j3 = new AfficherFile();
		
		comp.add(j1);
		comp.add(j2);
		comp.add(j3);

		InterfaceEtudiantRepository ETUDUNIVR = new EtudiantRepository(conn, comp);
		
		InterfaceUniversiteRepository UnivRep = new UniversiteRepository(conn, comp);

		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
