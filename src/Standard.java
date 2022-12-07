public class Standard extends Package {
	
	public Standard() {
     	super(TypePackage.Standard);
	}
	
	public Standard(TypePackage type_p) {
		super(type_p);
		}

	
	@Override
	public void SetNbLivreAutorise(int nombre) {
	
		this.nbrLivreAutorise  = nombre;
		
	}

	@Override
	public void SetNbLivrebonus(int nombre) {
		
		this.nbrLivreBonus = nombre;
		
	}

	@Override
	public int getNbrLivreAutorise() {
	
		return 20;
	}

	@Override
	public int getNbrLivreBonus() {
		
		return 5;
	}



}
