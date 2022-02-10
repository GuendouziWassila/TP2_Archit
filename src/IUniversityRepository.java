import java.sql.SQLException;

public interface IUniversiteRepository {
    InterfaceUniversite GetById(int universityId) throws SQLException;
}