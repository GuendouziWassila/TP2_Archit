import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IEtudiantREPO StudRep = new EtudiantRepository();
		IUnivREPO UnivRep= new UniversiteRepository();
		EtudiantService serv=new EtudiantService(StudRep, UnivRep);
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			//System.out.println("hello world");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
