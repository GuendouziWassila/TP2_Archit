public class Premuim extends Package {

	public Premuim() {
		super(TypePackage.Premium);

	}
	
	public Premuim(TypePackage nom_Tpack) {
		super(nom_Tpack);
		
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
		
		return 10;
	}

}
