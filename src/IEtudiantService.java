import java.util.ArrayList;

public interface IEtudiantService {
    public boolean inscription (IEtudiant etud);
	
   	public ArrayList<IEtudiant> GetEtudiantParUniversitye();
   	
   	public ArrayList<IEtudiant> GetEtudiatparLivreEmprunte();

   	public  void ajouterbonus(IEtudiant Et);
}
