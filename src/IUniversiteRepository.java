import java.sql.SQLException;

public interface IUniversiteRepository {
    public Universite GetById(int univID) throws SQLException;
}
