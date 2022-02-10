public class Frorfait_limite extends Etudiant {

	public Frorfait_limite(int matricule, String nom, String prenom, String email, String pwd, int id_universite) {
		super(matricule, nom, prenom, email, pwd, id_universite);
	}


	public void nbr_livre_autorize() {
		setNbLivreMensuel_Autorise(0);
	}

}