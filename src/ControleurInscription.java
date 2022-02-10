

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class ControleurInscription {
		private ViewInscription view;
		private EtudiantService etudserv;
		public ControleurInscription(ViewInscription view,EtudiantService etudserv) {

			this.view=view;
			this.etudserv=etudserv;
            }
		
		
                
			

				public void actionPerformed(ActionEvent e) {
				int matricule,id_univ=0;
				String nom,prenom,email,pwd=null;
				try {
					matricule=view.getMatricule();
					id_univ=view.getId_univ();
					nom=view.getNom();
					prenom=view.getPrenom();
					email=view.getEmail();
					pwd=view.getPwd();
					etudserv.inscription(matricule, nom, prenom, email, pwd, id_univ);

				}catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}



				}

			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	