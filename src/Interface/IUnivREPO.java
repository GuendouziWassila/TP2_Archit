package Interface;
import java.sql.SQLException;

import Class.Universite;

public interface IUnivREPO {
	abstract Universite GetById(int universityId) throws SQLException;
	abstract public int GetNbrLivre(int IdUniv) throws SQLException;
	abstract public int NbrBonus(int IdUniv) throws SQLException;

}


