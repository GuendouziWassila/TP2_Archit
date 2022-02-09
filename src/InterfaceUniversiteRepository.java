import java.sql.SQLException;

public interface InterfaceUniversiteRepository {

	public Universite GetById(int universityId) throws SQLException;
}

