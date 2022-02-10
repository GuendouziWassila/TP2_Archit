package Services;

import java.io.IOException;
import java.sql.SQLException;

public interface InterfaceEtudeRep {
	public void add(InterfaceEtudiant stud) throws SQLException, IOException;
	public boolean Exists(String email) throws SQLException, IOException;
	public boolean Exists(int mat) throws SQLException, IOException;
	public boolean VerifEmailMat(InterfaceEtudiant stud) throws SQLException, IOException;
}
