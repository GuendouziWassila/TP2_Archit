package Services;

import java.io.IOException;
import java.sql.SQLException;

import Repository.*;

public interface InterfaceUnivRep {
	public Universite GetById(int univId) throws SQLException, IOException;
	public int NbrLivreAutorise(int univId) throws SQLException, IOException;
	public int NbrLivreBonus(int univId) throws SQLException, IOException;
}
