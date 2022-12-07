import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService implements IEtudiantServ {
	
	private IEtudiantRep studRep;
	private IUniversityRep UnivRep;
	private IJournal j ;
    
	public EtudiantService(IEtudiantRep EtudRep ,IUniversityRep UnivRep, IJournal j) {
		super();
		this.studRep = EtudRep;
		this.UnivRep = UnivRep;
		this.j = j; 
  }

	 boolean inscription (Etudiant etud , int id_univ ) throws SQLException	
	{
	 /** 	IEtudiantRep StudRep= new EtudiantRepository(null, j);
	    IUniversityRep UnivRep= new UniversiteRepository(); **/
	  //  Etudiant stud = new Etudiant(matricule,nom,prenom,email,pwd,id_universite);
	   //IUniversity univ=UnivRep.GetById(id_univ);
		j.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+etud.getMatricule());
	    if(studRep.Existe_Email_Matricule(etud.getMatricule(), etud.getEmail())){
			return false;
		}
	    
		
       /**  Verify v = new Verify();
		boolean vv = v.verify(etud.getMatricule(), etud.getEmail());
		if (vv== false){
			return false;
		}*/
		int nbrlivreAutorisé = UnivRep.NbrLivreAutorise(id_univ);
  		   etud.setNbLivreMensuel_Autorise(nbrlivreAutorisé);
		/**if(email == null || email.length() == 0)
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
	    }**/
		
		
		
		/** if (univ.getPack() == TypePackage.Standard)
	     {
	          etud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 etud.setNbLivreMensuel_Autorise(10*2);
	     } */                          
	     
		 studRep.add(etud);
		 j.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+etud.getMatricule());
		return true;
	    
		
	}
	
	public void AddBenifit(IEtudiant Et) throws SQLException{
	/**int s=	etd.getNbLivreMensuel_Autorise();
	int h= etd.getId_universite();
	Universite uni = univ.GetById(h);
	TypePackage l = uni.getPack();
	if(l == TypePackage.Standard){
	    etd.SetBenifit(s+5);
	}
	if(l == TypePackage.Premium){
		etd.SetBenifit(s+10);
	}**/
	//IUniversity univ = UnivRep.GetById(Et.getId_universite());
		
	Package p = new Standard(null);
	Et.bonus(p.getNbrLivreBonus());
	}
	

public ArrayList<IEtudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<IEtudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}

@Override
public boolean inscription(IEtudiant etud) {

	return false;
}

@Override
public void ajouterbonus(IEtudiant Et) throws SQLException {
	
		    
	//IUniversity univ = UnivRep.GetById(Et.getId_universite());
		
	Package p = new Standard(null);
	Et.bonus(p.getNbrLivreBonus());
	
}






	
}
