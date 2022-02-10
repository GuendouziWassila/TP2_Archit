package Services;
import java.io.IOException;
import java.sql.SQLException;

import Repository.*;





public interface InterfUniversiteRep {

	public Universite GetById(int universityId) throws SQLException, IOException;
	public int NbrLivreAutoriser(int universityId) throws SQLException, IOException;
	public int GetNbrBonus(int universityId) throws SQLException, IOException;


}
