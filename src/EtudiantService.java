import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService implements InterEtudServ{
	
	/*La m�thode inscription permet d�ajouter un �tudiant et elle v�rifie le format de l�email, v�rifie l�existence de l�email et du matricule*/ 
       /* et initialise le nombre de livre mensuel autoris�.*/
	/*  donc on les  garde dans la m�thode car elles sont reliees entre eux */ 

	public boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtdRep StudRep= new EtudiantRepository();
	    EtudiantFactory stud = new EtudiantFactory();
	    System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
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
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
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
