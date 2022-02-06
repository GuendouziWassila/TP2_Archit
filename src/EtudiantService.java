import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	private InterfEtudiantRep StudRep;
	private InterfUniversiteRep UnivRep;
	
	
	
	public EtudiantService(InterfEtudiantRep StudRep, InterfUniversiteRep UnivRep) {
		this.StudRep= StudRep;
		this.UnivRep=UnivRep;
	}
	
	boolean inscription (InterfEtudiant etud) throws SQLException	
	{
		

	    
	    Universite univ=UnivRep.GetById(etud.getId_universite());
	    
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+etud.getMatricule());
	    
	    if(etud.getEmail() == null || etud.getEmail().length() == 0)
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(etud.getMatricule()))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(etud.getEmail()))
	    {
	        return false;
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          etud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 etud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 StudRep.add(etud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+etud.getMatricule());
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
