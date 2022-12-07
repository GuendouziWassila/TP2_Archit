import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService  implements IEtudiantService  {
	
	private IEtudiantRepository EtudRep;
	private IUniversiteRepository UnivRep;
	private IJournal jrnal;
	public EtudiantService(IEtudiantRepository EtudRep ,IUniversiteRepository UnivRep,IJournal jrnal) {
		super();
		this.EtudRep = EtudRep;
		this.UnivRep = UnivRep;
		this.jrnal=jrnal;
  }
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		EtudiantRepository StudRep= new EtudiantRepository();
	    UniversiteRepository UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, pr�nom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
	    if(email == null || email.length() == 0)
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
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;
	    
			
			public void Ajouterbonus (Etudiant E) {
				UniversiteRepository univ = UniversiteRepository univ.GetById(E.getId_universite());
				
				 if (univ.getPack() == TypePackage.Standard)
			     {
					 Package pack = new Standard(null);
					 E.bonus(pack.getNbrLivreBonus());
				        }
			     else if (univ.getPack() == TypePackage.Premium)
			     {
			    	 Package pack = new Premium(null);
			    	  E.bonus(pack.getNbrLivreBonus())	 ;   
			    	 }                           
			 }
	}
	
	
	



	
}
