import java.awt.event.ActionEvent;

public class ControlleurInscription {
		
	Etudiant E;
	EtudiantService ES;
	ViewInscription V;
	
		public ControlleurInscription(Etudiant E, EtudiantService ES , ViewInscription V) {
			
			this.E = E; 
			this.V = new ViewInscription();
			this.ES = ES ;
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			

			
			String matricule = V.Get_Mat();
			String nom = V.Get_Nom();
			String prenom = V.Get_Prenom();
			String email = V.Get_email();
			String password = V.Get_pwd();
			String ID_Univ = V.Get_id_univ();
			

		    ES.inscription(E);

		}
	}


