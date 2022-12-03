
public interface Etudiant_Rep_interface {
	public interface InterfaceEtudiantRep {
		public abstract void  add(Etudiant e);
		public abstract boolean Exists(int matricule);
		public  abstract boolean Exists(String email);
		boolean vérifier_format(int Matricule, String Email);
	}
}
