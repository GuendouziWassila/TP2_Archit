import java.sql.SQLException;

public interface IEtdRep{

	boolean Exists(int matricule) throws SQLException;

	boolean Exists(String email) throws SQLException;

	
	

}
