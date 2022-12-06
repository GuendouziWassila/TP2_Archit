import java.sql.SQLException;

public interface IUnivRepo {
	abstract Universite GetById(int universityId) throws SQLException;

}