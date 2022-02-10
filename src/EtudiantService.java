import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService implements InterfaceEtudiantService {

	private InterfaceEtudiantRep StudRep;
	private InterfaceUniversiteRep UnivRep;
	
	
	public EtudiantService(InterfaceEtudiantRep EtudRep ,InterfaceUniversiteRep UnivRep) {
		super();
		this.StudRep = EtudRep;
		this.UnivRep = UnivRep;
  }
	
	boolean inscription (Etudiant stud,int id_universite)
	{
		InterfaceUniversité univ=UnivRep.GetById(id_universite);

	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec le matricule "+stud.getMatricule());

	    if(stud.getEmail() == null || stud.getEmail().length() == 0)
	    {
	    	return false;
	    }

	   if (StudRep.Exists(stud.getMatricule()))
		   
	    {return false; 
	   }
	   

		if (StudRep.Exists(stud.getEmail()))
	   { return false;
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


@Override
public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

@Override
public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);

}


@Override
public boolean inscription() {
	// TODO Auto-generated method stub
	return false;
}




}