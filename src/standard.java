public class Standard extends Package {
	
	public Standard() {
     	super(TypePackage.Standard);
	}
	
	public Standard(TypePackage tpack) {
		super(tpack);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getNbrLivreAutorise() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getNbrLivreBonus() {
		// TODO Auto-generated method stub
		return 5;
	}
	public int setNbrLivreAutorise(int nbr) {
		// TODO Auto-generated method stub
		this.nbrlivreAutorise=nbr;
	} 
	public void SetNbLivrebonus(int nbr) {
		// TODO Auto-generated method stub
		this.nbrLivreBonus = nbr;
		
	}




}
