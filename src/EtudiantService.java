import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService implements IEtudiantService {

	private IEtudiantRepository StudRep;
	private IUniversiteRepository UnivRep;
	private IEtudiant stud;
	private IJournal composite;

	public EtudiantService(IEtudiantRepository StudRep, IUniversiteRepository UnivRep, IEtudiant stud, IJournal composite) {
		this.StudRep = StudRep;
		this.UnivRep = UnivRep;
		this.stud = stud;
		this.composite = composite;
	}


	public boolean inscription() throws SQLException {
		//EtudiantRepository StudRep= new EtudiantRepository();
		//UniversiteRepository UnivRep= new UniversiteRepository();
		//Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
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


	public ArrayList<Etudiant> GetEtudiantParUniversitye() {
		//...
		return new ArrayList<>(4);
	}

	public ArrayList<Etudiant> GetEtudiatparLivreEmprunte() {
		//...
		return new ArrayList<>(4);

	}


}
