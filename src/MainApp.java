
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matricule = 2;
		String nom = "Guendouziiiii";
		String prenom = "wassila";
		String email = "guen@gmail.com";
		String passcode = "xxxx";
		int univId = 1;

		EtudiantService serv = new EtudiantService();
		EtudiantRepository repo = new EtudRepo();
		UniversiteRepository UnivRepo = new UniverRepo();
		Etudiant stud = new Etud(matricule, nom, prenom, email, passcode, univId);

		try {
			Universite uni = UnivRepo.GetById(univId);
			if(uni != null) {
				serv.inscription(repo, UnivRepo, uni, stud);
			}else {
				System.out.println("ne peut pas cree etudiant");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
