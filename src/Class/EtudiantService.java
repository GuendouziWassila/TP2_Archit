package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Interface.IJournal;
import Interface.IEtudiant;
import Interface.IEtudRepo;
import Interface.IUnivRepo;

public class EtudiantService {
	
	private IEtudRepo StudRep;
	private IUnivRepo UnivRep;
	private IJournal journal;
	
	public EtudiantService(IEtudRepo StudRep, IUnivRepo UnivRep, IJournal comp) {
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
		this.journal = comp;
	}
	
	//Puisque la class Etudiant contient des methodes permettant divers manipulation, ce serait du gachis de ne pas les utiliser.
	public boolean inscription (IEtudiant Stud) throws SQLException
	{
		
	    AfficheDateClass.setSender("EtudiantService");
	    
	    journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+Stud.getMatricule());
	    
		if (StudRep.VerifEmailMat(Stud.getMatricule(), Stud.getEmail()))
	    {	return false;	}
		
		int nbrLivreAutorisé = UnivRep.GetNbrLivre(Stud.getId_universite());
		 Stud.setNbLivreMensuel_Autorise(nbrLivreAutorisé);
		 AjouterBonus(Stud);
		 
		 StudRep.add(Stud);
		 journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+Stud.getMatricule());
		 return true;
	    
	}
	
	public void AjouterBonus(IEtudiant Stud) throws SQLException {
		int nbr = UnivRep.NbrBonus(Stud.getId_universite());
		Stud.bonus(nbr);
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