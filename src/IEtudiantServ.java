import java.sql.SQLException;
import java.util.ArrayList;

public interface IEtudiantServ {
    public boolean inscription (IEtudiant etud);
	
	public ArrayList<IEtudiant> GetEtudiantParUniversitye();
	
	public ArrayList<IEtudiant> GetEtudiatparLivreEmprunte();

	public  void ajouterbonus(IEtudiant Et) throws SQLException;
}
