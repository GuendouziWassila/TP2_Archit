import java.sql.SQLException;

public interface EtudiantRepositoryInterf {
	boolean Exists(String email)throws SQLException;
	boolean Exists(int mat)throws SQLException;
	void add(Etudiant E) throws SQLException;
	
}
