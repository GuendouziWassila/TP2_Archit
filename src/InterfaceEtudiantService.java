import java.util.ArrayList;

public interface InterfaceEtudiantService {

	ArrayList<Etudiant> GetEtudiantParUniversitye();

	ArrayList<Etudiant> GetEtudiatparLivreEmprunte();
    public boolean inscription (InterfaceEtudiant etud);


}