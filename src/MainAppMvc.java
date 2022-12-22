
public class MainAppMvc {
	public static void main(String[] args) {
		
		EtudiantService serv = new EtudiantService();
		
		ViewInscription view = new ViewInscription();
		view.Show_InscriptionForm();

		ControlleurInscription ctrl = new ControlleurInscription(view, serv);



	}
}
