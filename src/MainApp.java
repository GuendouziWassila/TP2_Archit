import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IUniversiteRepository univ = new UniversiteRepository();
		IEtudiantRepository etud = new EtudiantRepository();


		EtudiantService serv=new EtudiantService(etud, univ);
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
