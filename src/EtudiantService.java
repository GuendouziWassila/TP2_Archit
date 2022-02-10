import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService {
	
	

	boolean inscription (EtudiantRepository StudRep, UniversiteRepository UnivRep, Universite univ, Etudiant stud) throws SQLException	
	{
	  
	  System.out.println("Log: debut de l'operation d'ajout de l'etudiant avec matricule "+stud.getMatricule());
	  
	  if(stud.getEmail() == null || stud.getEmail().length() == 0)
	  {
	  	return false;
	  }
	  
	  if (StudRep.Exists(stud.getMatricule())){
	    return false;
	  }
	    
		if (StudRep.Exists(stud.getEmail())){
	    return false;
	  }

		if (univ.getPack() == TypePackage.Standard){
	    stud.setNbLivreMensuel_Autorise(10);
	  
		}else if (univ.getPack() == TypePackage.Premium){
	    stud.setNbLivreMensuel_Autorise(10*2);
	  }                           
	     
		StudRep.add(stud);
		System.out.println("Log: Fin de l'operation d'ajout de l'etudiant avec matricule "+stud.getMatricule());
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
