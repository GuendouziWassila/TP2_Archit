import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService implements InterEtudServ{
	
	/*La méthode inscription permet d’ajouter un étudiant et elle vérifie le format de l’email, vérifie l’existence de l’email et du matricule*/ 
       /* et initialise le nombre de livre mensuel autorisé.*/
	/*  donc on les  garde dans la méthode car elles sont reliees entre eux */ 

	public boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtdRep StudRep= new EtudiantRepository();
	    EtudiantFactory stud = new EtudiantFactory();
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    }
		
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	}
		
		public void augment_nbr_livres_tousEtud(TypePackage pac) throws SQLException
	{
		 ArrayList<Etudiant> etudiants = GetEtudiatparLivreEmprunte();
		 for (Etudiant E : etudiants) 
		 {
			 if (pac == TypePackage.Standard)
		     {
				 E.setNbLivreMensuel_Autorise(15);
		     }
		     else if (pac == TypePackage.Premium)
		     {
		    	 E.setNbLivreMensuel_Autorise(15*2);
		     } 
		}
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
