
public class MainAppMvc {

	public static void main(String[] args) {
		
		ViewInscription theview=new ViewInscription();
		EtudiantService serv=new EtudiantService();
		ControleurInscription cntrol=new ControleurInscription(theview, serv);
		theview.setVisible(true);

	}

}
