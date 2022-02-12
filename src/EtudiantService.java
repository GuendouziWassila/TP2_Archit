import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/* La solution propos�e est garder les responsabilit�s dans la methode inscription car ils sont reli�s entre eux temporellement"

public class EtudiantService implements IEtdSrv{
	
	public boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		InterEtudRep StudRep= new EtudiantRepository();
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


	
}
