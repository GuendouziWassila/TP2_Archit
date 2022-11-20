import java.sql.SQLException;
import java.sql.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		EtudiantService serv=new EtudiantService();
		serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}


		


			
		
	}
}