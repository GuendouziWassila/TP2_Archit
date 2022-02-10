package db_repo_pack;

import java.sql.SQLException;

import add_pack.Etudiant;

public interface etudiant_interface {
	void add(Etudiant E) throws SQLException;
	boolean Exists(String email) throws SQLException;
	boolean Exists(int mat) throws SQLException;

}
