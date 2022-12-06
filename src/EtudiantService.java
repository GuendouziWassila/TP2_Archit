import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	private IEtudiantREPO StudRep;
	private IUnivREPO UnivRep;
	private IJournal journal;

	public EtudiantService(IEtudiantREPO StudRep, IUnivREPO UnivRep, IJournal comp) {
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
		this.journal = comp;

	}
	//la class Etudiant contient des methodes permettant divers manipulation qu'on peut utiliser.
		boolean inscription (Etudiant Stud) throws SQLException	{
		
			Universite univ=UnivRep.GetById(Stud.getId_universite());
	    
		    AfficheDateClass.setSender("EtudiantService");

	    
		    journal.outPut_Msg("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+Stud.getMatricule());

		    if (StudRep.VerifEmailMat(Stud.getMatricule(), Stud.getEmail()))
		    {	return false;	}
		
		
		
		    Stud.setNbLivreMensuel_Autorise(UnivRep.GetNbrLivre(univ));

			 StudRep.add(Stud);
			 journal.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+Stud.getMatricule());
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
