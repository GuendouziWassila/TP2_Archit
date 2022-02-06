import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	private InterfaceEtudeRep StudRep;
    private InterfaceUnivRep UnivRep;
	public EtudiantService(InterfaceEtudeRep StudRep, InterfaceUnivRep UnivRep) {
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
	}
	
	
	boolean inscription (InterfaceEtudiant stud) throws SQLException	
	{
	    Universite univ=UnivRep.GetById(stud.getId_universite());
	    
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
	    
	    if(stud.getEmail() == null || stud.getEmail().length() == 0)
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(stud.getMatricule()))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(stud.getEmail()))
	    {
	        return false;
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
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
