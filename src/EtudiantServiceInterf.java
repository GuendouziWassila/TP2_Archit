import java.sql.SQLException;

public interface EtudiantServiceInterf {
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	;
}
