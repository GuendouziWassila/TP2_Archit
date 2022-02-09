
public class ForfaitIllimite extends Etudiant{

	public ForfaitIllimite(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}

	@Override
	public void augment_nbr_livres() {	
		setNbLivreMensuel_Autorise(0);
	}

}
