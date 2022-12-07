import java.awt.event.ActionEvent;
public class ControleurInscription {
	Etudiant Etud;
	EtudiantService EtudSrv;
	ViewInscription Vinscp;
	
	public ControleurInscription(Etudiant Etud, EtudiantService EtudSrv , ViewInscription Vinscp) {
		
		this.Etud = Etud; 
		this.Vinscp = new ViewInscription();
		this.EtudSrv = EtudSrv ;
		
		
	}
	public void action(ActionEvent a) {
		String matricule = Vinscp.getMatricule();
		String nom = Vinscp.getNom();
		String prenom = Vinscp.getPrenom();
		String email = Vinscp.getEmail();
		String password = Vinscp.getPwd();
		String ID_Univ = Vinscp.getId_universite();
		

		EtudSrv.inscription(Etud, Etud.getId_universite());

	}
}
