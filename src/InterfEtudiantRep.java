import java.sql.SQLException;

public interface InterfEtudiantRep {
	
	public void add(InterfEtudiant etud) throws SQLException;
	public boolean Exists(String email) throws SQLException;
	public boolean Exists(int mat) throws SQLException;

	
	
}
