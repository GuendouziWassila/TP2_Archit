public abstract class Forfait extends Etudiant{

	public Forfait(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}

	public abstract void ajouter_nbr_livre ();
	public abstract void nbr_livre_authorize();
}
