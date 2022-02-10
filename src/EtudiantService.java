import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	   private InterfaceEtudiantRepository StudRep;
	   private InterfaceUniversiteRepository UnivRep;
	   public EtudiantService(  InterfaceEtudiantRepository StudRep, InterfaceUniversiteRepository UnivRep){
				this.StudRep  = StudRep;
				this.UnivRep = UnivRep;
	    }
	
	boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException	
	{
		
		//normalement on va pas les instancier ici et on va  utiliser frameworks seulement,  mais ils sont utilisés avec des méthodes pour assurer des résponsabilités
		 
		
		//pour la question 12 momentanément on garde les responsabilités tel quel sont, mais on ajoute une fonction email.match qui valide le format de notre email 
		StudRep= new EtudiantRepository();
	     UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, prenom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	 // verifier la validitee de l'email (format juste)
	 		if(email.matches(".+@.+\\.[a-z]+") != true)
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
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	    
		
	}
	
	public void AjouterBonus(InterfaceEtudiant Stud) throws SQLException {
		Universite univ=UnivRep.GetById(Stud.getId_universite());
		int nbr = 0;
		if (UnivRep.GetNbrLivre(univ)==10){
			nbr = 5;
		}
		if (UnivRep.GetNbrLivre(univ)==20){
			nbr = 10;
		}
		Stud.bonus(nbr);
	}
	

public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
