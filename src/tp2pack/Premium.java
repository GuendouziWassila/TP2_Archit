package tp2pack;

public class Premium  extends Forfait_Limite{

	public Premium(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
		
	}
	
	
	@Override
	public void Add_Nbr_Books() {
		setNbLivreMensuel_Autorise(15*2);
		
	}

	@Override
	public void NbrBookAuthorized() {
		setNbLivreMensuel_Autorise(20);
		
	}

}
