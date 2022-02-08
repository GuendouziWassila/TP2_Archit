

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AffichageComposite composite = new AffichageComposite();
		
		IJournal j1 = new AffichageEcran();
		IJournal j2 = new AffichageFichier();
		IJournal j3 = new AffichageEnrichir();
		
		composite.add(j1); //Affichage Ecran
		composite.add(j2); //Affichage Fichier
		composite.add(j3); //Affichage Message + Date + Emetteur 
		
		
		I_EtudiantRepository etudRep = new EtudiantRepository(composite);
		
		I_UniversiteRepository univRep = new UniversiteRepository(composite);
		
		EtudiantService etud_service = new EtudiantService(etudRep, univRep, composite);
		
		try {
			etud_service.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
