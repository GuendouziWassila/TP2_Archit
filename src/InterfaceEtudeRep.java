import java.sql.SQLException;

public interface InterfaceEtudeRep {
	public void add(InterfaceEtudiant stud) throws SQLException;
	public boolean Exists(String email) throws SQLException;
	public boolean Exists(int mat) throws SQLException;
}
