import java.sql.SQLException;

public interface UniversiteRepositoryInterf {
	Universite GetById(int universityId) throws SQLException;
}
