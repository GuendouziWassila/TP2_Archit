package tp2pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EtudiantService implements IEtudService {
	
	   
	public boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtudRepository StudRep= new EtudiantRepository();
		 EtudFactory stud = new EtudFactory();
	    
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
		 ArrayList<Etudiant> etud = GetEtudiatparLivreEmprunte();
		 for (Etudiant E : etud) 
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
