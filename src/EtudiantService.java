import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService {
	
	IJournal journal = new diffOutputJournal("def");

	boolean inscription (EtudiantRepository StudRep, UniversiteRepository UnivRep, Universite univ, Etudiant stud, String email, int matricule) throws SQLException	
	{
	  
	  journal.outPut_Msg("debut de l'operation d'ajout de l'etudiant avec matricule "+matricule);
	  
	  if(email == null || email.length() == 0){
	  	return false;
	  }
	  
	  if (StudRep.Exists(matricule)){
	    return false;
	  }
	    
		if (StudRep.Exists(email)){
	    return false;
	  }
	     
		StudRep.add(stud);
		journal.outPut_Msg("Fin de l'operation d'ajout de l'etudiant avec matricule "+matricule);
		return true;
	}
	
public ArrayList<Etudiant> GetEtudiantParUniversitye(){
  //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte(){
  //...
	return new ArrayList<>(4);	
}
	
}
