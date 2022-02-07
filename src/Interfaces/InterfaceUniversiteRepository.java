package Interfaces;
import java.sql.SQLException;

public interface InterfaceUniversiteRepository {
    InterfaceUniversite GetById(int universityId) throws SQLException;
}
