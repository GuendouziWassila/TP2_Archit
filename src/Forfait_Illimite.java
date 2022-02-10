
public class Forfait_Illimite extends Etudiant{
	
	
	public Forfait_Illimite(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}


	@Override
	public void NbrBookAuthorized() {
		setNbLivreMensuel_Autorise(0);
		
	}

}
