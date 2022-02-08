//// pour l'instanciation d'un objet de type Etudiant
public class etud_injection {
	static Etudiant std;
	static Etudiant setEtud(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		std=new Etudiant( matricule, nom,  prenom, email, pwd, id_universite);
		return std;
	}

}
