

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AffichageComposite composite = new AffichageComposite();
		
		IJournal journal_Ecran = new AffichageEcran();
		IJournal journal_File = new AffichageFichier();
		IJournal journal_Enrichir = new AffichageEnrichir();
		
		composite.ajouter(journal_Ecran); 	 //Affichage Ecran
		composite.ajouter(journal_File);     //Affichage Fichier
		composite.ajouter(journal_Enrichir); //Affichage Message + Date + Emetteur 
		
		
		Etudiant stud = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com", "xxxx", 1);
		
		I_EtudiantRepository etudRep = new EtudiantRepository(composite);
		
		I_UniversiteRepository univRep = new UniversiteRepository(composite);
		
		EtudiantService etud_service = new EtudiantService(etudRep, univRep, composite);
		
		try {
			etud_service.inscription(stud);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
