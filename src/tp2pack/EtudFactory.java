package tp2pack;
public class EtudFactory {

	
	public Etudiant CreerEtud (int matricule, String nom, String prenom, String email, String pwd, int id_universite, TypePackage pac)
	{
		 switch(pac)
	        {
	            case Standard: 
	            	return new Standard(matricule, nom, prenom, email, pwd,id_universite); 
	            	
	            case Premium: 
	            	return new Premium(matricule, nom, prenom, email, pwd,id_universite); 
	            	
	            default: 
	            	return new Forfait_Illimite (matricule, nom, prenom, email,  pwd, id_universite);
	        }
	}

	
}
