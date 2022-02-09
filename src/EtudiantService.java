import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService  {
	
	verif_Pack pack;
	String cla="la classe est EtudiantService";
	
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		EtudiantRepository StudRep= etud_repo_injection.creat_etud();
	    UniversiteRepository UnivRep=univ_repo_injection.creat_univ();
	    Etudiant stud =etud_injection.setEtud(matricule, nom, pr�nom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    App_composite.setMessage("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule+", " +cla);
	  //  System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
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
		
	     pack.verif(univ, stud);
		 StudRep.add(stud);
		 
		 //System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 App_composite.setMessage("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule+", " +cla);
		 return true;
	    
		
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
