import java.sql.SQLException;

public interface InterfaceEtudiantdRep{

	boolean Exists(int matricule) throws SQLException;

	boolean Exists(String email) throws SQLException;

	
	

}
