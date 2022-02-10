import java.util.ArrayList;

public interface InterfaceEtudiantService {
    public abstract boolean inscription ();

	ArrayList<Etudiant> GetEtudiantParUniversitye();

	ArrayList<Etudiant> GetEtudiatparLivreEmprunte();

}