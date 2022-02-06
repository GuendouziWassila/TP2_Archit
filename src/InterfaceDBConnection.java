import java.sql.Connection;
import java.sql.SQLException;

public interface InterfaceDBConnection {
	public Connection getConn() throws SQLException;
}
