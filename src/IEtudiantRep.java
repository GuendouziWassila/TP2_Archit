import java.sql.SQLException;

public interface IEtudiantRep {
    boolean Exists(String email) throws SQLException;
    void add(Etudiant E) throws SQLException;
    boolean Exists(int mat) throws SQLException;
    boolean Existe_Email_Matricule(int matricule, String email) throws SQLException;
}