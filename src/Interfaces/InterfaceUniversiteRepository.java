import java.sql.SQLException;

public interface InterfaceUniversiteRepository {

	public Universite GetById(int universityId) throws SQLException;
	
	public int GetNbrLivre(Universite univ) throws SQLException;
}

