
public class Factory {

	public Etudiant CreateEtud (int matricule, String nom, String prenom, String email, String pwd, int id_universite, TypePackage pac)
	{
		 switch(pac)
	        {
	            case Standard: 
	            	return new Forfait_standard(matricule, nom, prenom, email, pwd,id_universite); 
	            	
	            case Premium: 
	            	return new Forfait_primium(matricule, nom, prenom, email, pwd,id_universite); 
	            	
	            default: 
	            	return new Frorfait_limite (matricule, nom, prenom, email,  pwd, id_universite);
	        }
	}

}
