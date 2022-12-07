
public class Standard extends Pack {
	public Standard() {
     	super(Package.Standard);
	}
	
	public Standard(Package type_p) {
		super(type_p);
	}

	public void SetNbLivreAutorise(int nmbr) {
		this.nbrLivreAutorise  = nmbr;		
	}
	public int getNbrLivreAutorise() {
		return 10;
	}
	
	public int getNbrLivreBonus() {
		return 5;
	}
	
	
}
