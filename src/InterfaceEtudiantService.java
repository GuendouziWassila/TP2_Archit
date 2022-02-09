import java.util.ArrayList;

public interface InterfaceEtudiantService {

    public boolean inscription (InterfaceEtudiant etud);
	
	public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye();
	
	public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte();

	public  void ajouterbonus(InterfaceEtudiant Et);


}
