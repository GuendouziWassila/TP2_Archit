import java.sql.SQLException;

public interface InterfaceUniversiteRepository {
    Universite GetById(int universityId) throws SQLException;
}
