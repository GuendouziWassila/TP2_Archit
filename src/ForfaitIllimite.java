
public class ForfaitIllimite extends Etudiant{

	public ForfaitIllimite(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}

	@Override
	public void nbr_book_authorized() {	
		setNbLivreMensuel_Autorise(0);
	}

}
