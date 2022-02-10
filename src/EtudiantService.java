import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EtudiantService implements InterfaceEtudiantService {
	
	
	private IEtudRep EtudRep;
	private IUnivRep UnivRep;
	

	public EtudiantService(IEtudRep EtudRep ,IUnivRep UnivRep) {
		super();
		this.EtudRep = EtudRep;
		this.UnivRep = UnivRep;
		
  }
 


	boolean inscription (Etudiant etud , int ID_univ ) throws SQLException	
	{
	    Universite univ = UnivRep.GetById(ID_univ) ;
	    j.outPut_Msg("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+etud.getMatricule());
	    
	    
	    if(EtudRep.Existe_Email_Matricule(etud.getMatricule(), etud.getEmail())){
  			return false;
  		} 
		
	    int nbrlivreAutoris� = UnivRep.NbrLivreAutorise(ID_univ);
		   etud.setNbLivreMensuel_Autorise(nbrlivreAutoris�);
		
		   EtudRep.add(etud);
			 j.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+etud.getMatricule());
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


@Override
public boolean inscription (IEtud etud) {
	// TODO Auto-generated method stub
	return false;
}
	
}
