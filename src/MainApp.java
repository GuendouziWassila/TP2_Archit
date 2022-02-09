import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		AfficherComposit AffichageListes = new AfficherComposit();
		IJournal AfficherEcran = new AfficherEcran();
		IJournal AfficherDate = new AfficherDate();
		IJournal AfficherFile = new AfficherFile();

		AffichageListes.add(AfficherFile);
		AffichageListes.add(AfficherEcran);
		AffichageListes.add(AfficherDate);
		AffichageListes.outPut_Msg("Ce message va etre affiché par 3 façon différentes");
		
		
		
        InterfaceEtudiantRepository StudRep = new EtudiantRepository();
        InterfaceUniversiteRepository UnivRep= new UniversiteRepository();

       
		EtudiantService serv=new EtudiantService(StudRep, UnivRep);
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

