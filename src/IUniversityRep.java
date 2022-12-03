import java.sql.SQLException;

public interface IUniversityRep {
    Universite GetById(int universityId) throws SQLException;
}
