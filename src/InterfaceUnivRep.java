import java.io.IOException;
import java.sql.SQLException;

public interface InterfaceUnivRep {
	public Universite GetById(int univId) throws SQLException, IOException;
}
