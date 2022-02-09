import java.sql.SQLException;

public interface InterEtudRep {

	boolean Exists(int matricule) throws SQLException;

	boolean Exists(String email) throws SQLException;

	
	
}
