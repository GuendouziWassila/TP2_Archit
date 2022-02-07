import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	private InterfaceEtudeRep StudRep;
    private InterfaceUnivRep UnivRep;
    private IJournal journal;
	public EtudiantService(InterfaceEtudeRep StudRep, InterfaceUnivRep UnivRep,IJournal journal) {
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
		this.journal = journal;
	}
	
	
	boolean inscription (InterfaceEtudiant stud) throws SQLException, IOException	
	{
	    //Universite univ=UnivRep.GetById(stud.getId_universite());
	    
	    //System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
	    journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
	    // la vérification de mail et matricule devient dans la classe EtudiantRepository
	    if(StudRep.VerifEmailMat(stud)) {
	    	return false;
	    }
		
	 // la verfication de type package pour avoir le nombre de livre autorisé  devient dans la classe UniversiteRepository et ici en initialse le nombre de livre
		 int nbrlivreAutorisé = UnivRep.NbrLivreAutorise(stud.getId_universite());
		   stud.setNbLivreMensuel_Autorise(nbrlivreAutorisé);
		 
		 
		 StudRep.add(stud);
		 //System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
		 journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
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
