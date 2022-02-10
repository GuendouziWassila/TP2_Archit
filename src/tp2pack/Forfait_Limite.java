package tp2pack;

public abstract class Forfait_Limite  extends Etudiant {

	public Forfait_Limite(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}
	
	public abstract void Add_Nbr_Books ();

	
}
