import java.sql.SQLException;
import java.util.ArrayList;

public class EtudiantService implements InterfaceEtudiantService{
	
	public void AjouerBonusEtudiant(Etudiant E, InterfaceUniversiteRepository UR) throws SQLException{
		
		InterfaceUniversite universite = UR.GetById(E.getId_universite());
		AbsractFactory AB = new AbsractFactory();
		Package P = AB.getPackage(universite.getPack());
		E.bonus(P.getBonus());
	}
	@Override
	public boolean inscription(Etudiant etudiant, InterfaceUniversite universite, InterfaceEtudiantRepository etudiantRepository) throws SQLException {
			System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+etudiant.getMatricule());
			Registration R = new Registration();
			if(R.StudentVerification(etudiant, etudiantRepository)){
					R.setNbLivreMensuelAutorise(etudiant, universite.getPack());
					etudiantRepository.add(etudiant);
					System.out.println("Log: Fin de l'operation d'ajout de l'etudiant avec matricule "+etudiant.getMatricule());
					return true;
					}		
		return false;
	}
	/* @Override
	public boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException	
	{
		InterfaceEtudiantRepository StudRep= new EtudiantRepository();
	    InterfaceUniversiteRepository UnivRep= new UniversiteRepository();
	    InterfaceEtudiant stud = new Etudiant(matricule, nom, prenom, email,pwd,id_universite);
	    InterfaceUniversite univ=UnivRep.GetById(id_universite);
	    
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
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
		System.out.println("Log: Fin de l'operation d'ajout de l'etudiant avec matricule "+matricule);
		return true;	
	}
	*/ 
	@Override
	public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye(){
    //...
	return new ArrayList<>(4);
	}

	@Override
	public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte(){
    //...
	return new ArrayList<>(4);
	}
		
}
