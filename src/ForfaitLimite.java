
public abstract class ForfaitLimite extends Etudiant{

	public ForfaitLimite(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}
	
	public abstract void Add_Nbr_Books ();

	@Override
	public void augment_nbr_livres() {
		setNbLivreMensuel_Autorise(20);
	}

}
