import java.sql.SQLException;
import java.util.ArrayList;

public class EtudiantService {
	
	private IJournal journal;
	private I_EtudiantRepository etudRep;
	private I_UniversiteRepository univRep;
	
	
	public EtudiantService(I_EtudiantRepository etudRep, I_UniversiteRepository univRep, IJournal comp) 
	{
		this.journal = comp;
		this.etudRep = etudRep;
		this.univRep = univRep;
	}
	
	
	
	boolean inscription (Etudiant stud) throws SQLException	
	{
		
	    Universite univ = univRep.GetById(stud.getId_universite());
	    
	    AffichageEnrichir.setSender("EtudiantService");
	    
	    journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule " + stud.getMatricule());
	    
	    
		if (etudRep.Verification(stud.getMatricule(), stud.getEmail()))
	    {
	        return false;
	    }
		
	    stud.setNbLivreMensuel_Autorise(univRep.GetNbLivreMensuel(univ));
	                               
	     
		 etudRep.add(stud);
		 journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+ stud.getMatricule());
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
