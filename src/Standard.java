
public class Standard extends ForfaitLimite{

	public Standard(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}

	@Override
	public void Add_Nbr_Books() {
		setNbLivreMensuel_Autorise(15);	
	}

	@Override
	public void augment_nbr_livres() {
		setNbLivreMensuel_Autorise(10);	
	}

}
