import java.util.ArrayList;
public interface InterfaceEtudiantService{
public void Add_NbrBooks(TypePackage pac);	
boolean inscription(int matricule, String nom, String prénom, String email,String pwd, int id_universite); 
public ArrayList<Etudiant> GetEtudiantParUniversitye();
	
	public ArrayList<Etudiant> GetEtudiatparLivreEmprunte();
}
