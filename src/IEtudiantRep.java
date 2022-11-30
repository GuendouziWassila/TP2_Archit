public interface IEtudiantRep {
    boolean Exists(String email);
    void add(Etudiant E);
    boolean Exists(int mat);
}