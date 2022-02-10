import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	
	 private IEtudiantRepository StudRep;
	  private IUniversiteRepository UnivRep;
		
	  public EtudiantService(IEtudiantRepository StudRep ,IUniversiteRepository UnivRep) {
			super();
			this.StudRep = StudRep;
			this.UnivRep = UnivRep; 
	  }
	
	boolean inscription (Etudiant etud , int ID_univ ) throws SQLException	
	{
          Universite univ = UnivRep.GetById(ID_univ) ;
         System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+etud.getMatricule());
	    
          if(StudRep.Existe_Email_Matricule(etud.getMatricule(), etud.getEmail())){
  			return false;
  		}
		
		
          int nbrlivreAutorisé = UnivRep.NbrLivreAutorise(ID_univ);
  		   etud.setNbLivreMensuel_Autorise(nbrlivreAutorisé);
  		                                               
	     
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
