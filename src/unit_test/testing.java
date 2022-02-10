package unit_test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import service_pack.EtudiantService;

class testing {

	@Test
	void test() throws SQLException {
		EtudiantService stud=new EtudiantService();
		boolean output= stud.inscription(3, "manel","boudj","manel@gmail.com","45dljv",2);
		assertEquals(false,output);
	}

}
