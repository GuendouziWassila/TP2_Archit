import java.sql.SQLException;

public interface IEtudiant {
	abstract void add(Etudiant E)throws SQLException;
	abstract boolean Exists(String email)throws SQLException;
	abstract boolean Exists(int mat)throws SQLException;
	abstract public boolean VerifEmailMat(int mat, String email) throws SQLException;
}
