import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnection conn = DBConnection.getInstance();
		
		AfichMsgDTypes type= new AfichMsgDTypes();
		IJournal jrnal1 = new AfichMsgEcran();
		IJournal jrnal2 = new AfichMsgDate();

		type.add(jrnal1);
		type.add(jrnal2);
		
		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
