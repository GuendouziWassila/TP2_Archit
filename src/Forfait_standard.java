
public class Forfait_standard extends Forfait {

	public Forfait_standard(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}

	@Override
	public void ajouter_nbr_livre() {
		setNbLivreMensuel_Autorise(15);	
	}

	@Override
	public void nbr_livre_authorize() {
		setNbLivreMensuel_Autorise(10);	
	}
}
