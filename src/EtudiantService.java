import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService implements InterfaceEtudiantService {

	private InterfaceEtudiantRep StudRep;
	private InterfaceUniversiteRep UnivRep;
	private IJournal journal;
	
	
	public EtudiantService(InterfaceEtudiantRep EtudRep ,InterfaceUniversiteRep UnivRep,IJournal journal) {
		super();
		this.StudRep = EtudRep;
		this.UnivRep = UnivRep;
		this.journal=journal;
  }
	
	boolean inscription (Etudiant stud,int id_universite)
	{
		InterfaceUniversité univ=UnivRep.GetById(id_universite);

		journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec le matricule "+stud.getMatricule());
	    
		if(StudRep.vérifier(stud.getMatricule(), stud.getEmail())){
  			return false;
  		}
		
		
		 int nbrlivreAutorisé = UnivRep.NbrLivreAutorise(id_universite);
		 stud.setNbLivreMensuel_Autorise(nbrlivreAutorisé);
		 
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





}