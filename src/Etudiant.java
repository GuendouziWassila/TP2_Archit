
public class Etudiant implements EtudiantInterf {

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

		@Override
		public int getMatricule() {
			return matricule;
		}


		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}

		@Override
		public String getNom() {
			return nom;
		}

		
		public void setNom(String nom) {
			this.nom = nom;
		}

		@Override
		public String getPrenom() {
			return prenom;
		}

		
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		@Override
		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public int getNbLivreMensuel_Autorise() {
			return nbLivreMensuel_Autorise;
		}


		public void setNbLivreMensuel_Autorise(int nbLivreMensuel_Autorise) {
			this.nbLivreMensuel_Autorise = nbLivreMensuel_Autorise;
		}

		@Override
		public int getNbLivreEmprunte() {
			return nbLivreEmprunte;
		}


		public void setNbLivreEmprunte(int nbLivreEmprunte) {
			this.nbLivreEmprunte = nbLivreEmprunte;
		}

		@Override
		public int getId_universite() {
			return id_universite;
		}


		public void setId_universite(int id_universite) {
			this.id_universite = id_universite;
		}

		@Override
		public String getPwd() {
			return pwd;
		}


		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		
		
	    }
