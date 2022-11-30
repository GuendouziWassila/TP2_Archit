import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService implements IEtudiantServ {
	
	IJournal msg1= new ScrennMsg();
	public boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException	
	{
		IEtudiantRep StudRep= new EtudiantRepository();
	    IUniversityRep UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule,nom,prenom,email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    msg1.outPut_Msg("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule); //System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
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
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 StudRep.add(stud);
		msg1.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule); //System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
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
