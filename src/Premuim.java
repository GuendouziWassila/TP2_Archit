public class Premuim extends Package {

	public Premuim() {
		super(TypePackage.Premium);

	}
	
	public Premuim(TypePackage nom_Tpack) {
		super(nom_Tpack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SetNbLivreAutorise(int nombre) {
		// TODO Auto-generated method stub
		this.nbrLivreAutorise  = nombre;
		
	}

	@Override
	public void SetNbLivrebonus(int nombre) {
		// TODO Auto-generated method stub
		this.nbrLivreBonus = nombre;
		
	}

	@Override
	public int getNbrLivreAutorise() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getNbrLivreBonus() {
		// TODO Auto-generated method stub
		return 10;
	}

}
