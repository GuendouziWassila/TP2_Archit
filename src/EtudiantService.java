import java.sql.SQLException;
import java.util.ArrayList;

public class EtudiantService implements InterfaceEtudiantService{
	
	private InterfaceEtudiantRepository EtudRep;
    private InterfaceUniversiteRepository UnivRep;
	private IJournal  AffichageListes;
	public void AjouerBonusEtudiant(Etudiant E, InterfaceUniversiteRepository UR) throws SQLException{
		
		InterfaceUniversite universite = UR.GetById(E.getId_universite());
		AbsractFactory AB = new AbsractFactory();
		Package P = AB.getPackage(universite.getPack());
		E.bonus(P.getBonus());
	}
	
   public EtudiantService(InterfaceEtudiantRepository EtudRep , InterfaceUniversiteRepository UnivRep, IJournal AffichageListes) {
		super();
		this.EtudRep = EtudRep;
		this.UnivRep = UnivRep;
		this.AffichageListes = AffichageListes;
   }
	@Override
	public boolean inscription(Etudiant etudiant, InterfaceUniversite universite, InterfaceEtudiantRepository etudiantRepository) throws SQLException {
		AffichageDate.setClassName("EtudiantService");
		AffichageListes.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule " + etudiant.getMatricule());
		Registration R = new Registration();
		if (R.StudentVerification(etudiant, etudiantRepository)) {
			R.setNbLivreMensuelAutorise(etudiant, universite.getPack());
			etudiantRepository.add(etudiant);
			AffichageListes.outPut_Msg("Log: Fin de l'operation d'ajout de l'etudiant avec matricule " + etudiant.getMatricule());
			return true;
		}
		return false;
	}
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
