import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService implements IEtdSrv {
	
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
	
	public void AddNbrBooksAllStudent (TypePackage pac) throws SQLException
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


/* la solution proposée est de garder les responsabilités dans la méthode inscription car ils sont reliés entre eux temporellement */ 	
}