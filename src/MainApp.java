import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			InterfaceDBConnection conn = DBConnection.getinstance();
			afficher_msg_type CompositeJ = new afficher_msg_type();
			
			Etudiant etudiant1 =new Etudiant(1, "Guendouziiiii", "wassila", "guennf@gmail.com","xxxx",1);
			Etudiant etudiant2 =new Etudiant(2, "ikhlas", "cherbi", "ikhlascherbi@gmail.com","xxxx",2);
			ViewInscription v = new ViewInscription();
			IJournal journal1 = new Affiche_msg_Ecran();
			IJournal journal2 = new Afficher_date();

			

			try {
				serv.inscription(etudiant1, 1);

			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		//main_tp 2 
	}


