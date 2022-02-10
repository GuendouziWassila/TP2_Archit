import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args)  {	
		
		InterfaceDBConnection conn = DBConnection.getinstance();
		AfficherCompsite CompositeJ = new AfficherCompsite();
		
		Etudiant etudiant1 =new Etudiant(1, "Guendouziiiii", "wassila", "guennf@gmail.com","xxxx",1);
		Etudiant etudiant2 =new Etudiant(2, "Khelouf", "Feriel", "fifi@gmail.com","xxxx",2);
		ViewInscription v = new ViewInscription();
		IJournal journal1 = new AfficheEcran();
		IJournal journal2 = new AfficherDate();

		CompositeJ.add(journal1);
		CompositeJ.add(journal2);

		InterfaceEtudiantRep etudRep = new EtudiantRepository(conn,CompositeJ);
		
		InterfaceUniversiteRep univRep = new UniversiteRepository(conn,CompositeJ);
		
		EtudiantService serv = new EtudiantService(etudRep ,univRep,CompositeJ);

		try {
			serv.inscription(etudiant1, 1);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
