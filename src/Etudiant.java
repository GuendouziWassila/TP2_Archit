
public class Etudiant implements InterfaceEtudiant {

		private int matricule;
	    private String nom;
	    private String prenom;
	    private String email ;
	    private String pwd;
	    private int nbLivreMensuel_Autorise;
	    private int nbLivreEmprunte;
	    private int id_universite;
	    
	   
		public Etudiant(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
			
			this.matricule = matricule;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.pwd = pwd;
			this.id_universite = id_universite;
		}

         
		public void bonus(int nbr){

			this.nbLivreMensuel_Autorise +=nbr ;
		}
		

		
		/* à voir  si je l'ajoute pour bonus qui utlise méthodes Etudiant  ,  sans passer par université pour getId et savoir son type de package (offre université) , si E.getNbLivreEmprunte()==10 donc le typepackage est: standard et si E.getNbLivreEmprunte()==20 donc c'est premium
		  
		  public void ajout_bonus(Etudiant E) {
			if ( E.getNbLivreEmprunte()==10)
		    {
		         E.setNbLivreMensuel_Autorise(15);
		    }
		    else if (E.getNbLivreEmprunte() == 20)
		    {
		   	 E.setNbLivreMensuel_Autorise(30);
		    }
		}*/
		
		
		public int getMatricule() {
			return matricule;
		}


		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getNbLivreMensuel_Autorise() {
			return nbLivreMensuel_Autorise;
		}


		public void setNbLivreMensuel_Autorise(int nbLivreMensuel_Autorise) {
			this.nbLivreMensuel_Autorise = nbLivreMensuel_Autorise;
		}


		public int getNbLivreEmprunte() {
			return nbLivreEmprunte;
		}


		public void setNbLivreEmprunte(int nbLivreEmprunte) {
			this.nbLivreEmprunte = nbLivreEmprunte;
		}


		public int getId_universite() {
			return id_universite;
		}


		public void setId_universite(int id_universite) {
			this.id_universite = id_universite;
		}


		public String getPwd() {
			return pwd;
		}


		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		
		
		
		
		
	    }
