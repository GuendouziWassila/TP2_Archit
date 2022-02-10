package Class;

import Interface.*;

import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService implements IEtudiantService {

	private IEtudiantRepository StudRep;
	private IUniversiteRepository UnivRep;
	private IEtudiant stud;
	private IJournal composite;
	private IAbstractFactory packageFactory;

	public EtudiantService(IEtudiantRepository StudRep, IUniversiteRepository UnivRep, IJournal composite, IAbstractFactory packageFactory) {
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
		this.composite = composite;
		this.packageFactory = packageFactory;
	}


	public boolean inscription(IEtudiant stud) throws SQLException {
		//Class.EtudiantRepository StudRep= new Class.EtudiantRepository();
		//Class.UniversiteRepository UnivRep= new Class.UniversiteRepository();
		//Class.Etudiant stud = new Class.Etudiant(matricule, nom, prénom, email,pwd,id_universite);
		Universite univ = UnivRep.GetById(stud.getId_universite());

		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule " + stud.getMatricule());
		//System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule " + stud.getMatricule());

		// la verification du email et matricule ce pass dans etudiant repository
		if(!StudRep.checkEmailAndMatricule(stud)){
			return false;
		}

		// l'affectation du pack ce pass dans universite repository
		stud = UnivRep.setPack(stud, univ);

		StudRep.add((Etudiant) stud);
		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule " + stud.getMatricule());
		//System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule " + stud.getMatricule());
		return true;


	}

	public void giveBonus(IEtudiant Stud) throws SQLException {
		IUniversite univ = UnivRep.GetById(Stud.getId_universite());

		IPackage packageType = packageFactory.getPackage(univ);
		Stud.setBonus(packageType.getNbrLivreBonus());
	}


	public ArrayList<Etudiant> GetEtudiantParUniversitye() {
		//...
		return new ArrayList<>(4);
	}

	public ArrayList<Etudiant> GetEtudiatparLivreEmprunte() {
		//...
		return new ArrayList<>(4);

	}


}
