
public class Premium extends Pack {
	public Premium() {
		super(Package.Premium);

	}
	
	public Premium(Package nom_pack) {
		super(nom_pack);
		
	}

	
	public void SetNbLivreAutorise(int nmbr) {
		this.nbrLivreAutorise  = nmbr;
		
	}


	public int getNbrLivreAutorise() {
		return 20;
	}
	
	public int getNbrLivreBonus() {
	
		return 10;
	}
	
	

	

}
