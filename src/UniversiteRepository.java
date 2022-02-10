import java.sql.SQLException;

public interface UniversiteRepository {	
	Universite GetById(int universityId) throws SQLException;
	
}
