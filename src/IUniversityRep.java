import java.sql.SQLException;

public interface IUniversityRep {
    public abstract  Universite GetById(int id) throws SQLException;
	
	public abstract int NbrLivreAutorise(int id_univ) throws SQLException;
}
