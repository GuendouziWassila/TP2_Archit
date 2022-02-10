package service_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import add_pack.Etudiant;
import add_pack.Universite;
import composant_pack.App_composite;
import db_repo_pack.EtudiantRepository;
import db_repo_pack.UniversiteRepository;


public class EtudiantService  {
	
	verif_Pack pack;
	String cla="la classe est EtudiantService";
	
	public boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
		EtudiantRepository StudRep= new EtudiantRepository();
	    UniversiteRepository UnivRep=new UniversiteRepository();
		//EtudiantRepository StudRep= etud_repo_injection.creat_etud();
	    //UniversiteRepository UnivRep=univ_repo_injection.creat_univ();
	    Etudiant stud =etud_injection.setEtud(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    App_composite.setMessage("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule+", " +cla);
	  //  System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
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
		
	     pack.verif(univ, stud);
	   
	     stud.ajout_bonus(stud);
		 StudRep.add(stud);
		 
		 //System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 App_composite.setMessage("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule+", " +cla);
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
