import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
       private IEtudiantRepository StudRep;
	   private IUniversiteRepository UnivRep;
	   private Ijournal Journal;
	   public EtudiantService(  IEtudiantRepository StudRep, IUniversiteRepository UnivRep, Ijournal Journal){
				this.StudRep  = StudRep;
				this.UnivRep = UnivRep;
				this.Journal = Journal;
	}
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		EtudiantRepository StudRep= new EtudiantRepository();
	    UniversiteRepository UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, pr�nom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    AfficherDate.setnomClass("Etudiant Service");
		Journal.outPut_Msg("Log: debut de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }

		// verifier la validitee de l'email (format juste)
		if(email.matches(".+@.+\\.[a-z]+") != true)
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
		 Journal.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
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
