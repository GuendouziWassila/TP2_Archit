
public class MainApp {

	public static void main(String[] args) {

		int matricule = 2;
		String nom = "Guendouziiiii";
		String prenom = "wassila";
		String email = "guen@gmail.com";
		String passcode = "xxxx";
		int univId = 1;

		EtudiantService serv = new EtudiantService();
		EtudiantRepository repo = new EtudRepo();
		UniversiteRepository UnivRepo = new UniverRepo();

		try {
			Universite uni = UnivRepo.GetById(univId);
			if(uni != null) {
				Etudiant stud = new Etud(matricule, nom, prenom, email, passcode, univId, uni.getPack());
				serv.inscription(repo, UnivRepo, uni, stud, email, matricule);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
