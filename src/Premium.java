
public class Premium extends ForfaitLimite{


	public Premium(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
		
	}

	@Override
	public void Add_Nbr_Books() {
		setNbLivreMensuel_Autorise(15*2);
	}

	@Override
	public void nbr_book_authorized() {
		setNbLivreMensuel_Autorise(20);
	}

}
