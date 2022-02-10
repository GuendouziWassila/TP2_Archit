
public interface IEtudiantRepository {
	public abstract void  add(Etudiant E);
	public abstract boolean Exists(int mat);
	public  abstract boolean Exists(String email);
	public boolean Existe_Email_Matricule(int Matricule, String Email);
}
