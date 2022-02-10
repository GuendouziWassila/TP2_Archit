
public class Premium extends Package{

	public Premium() {
		super(TypePackage.Premium);

	}
	
	public Premium(TypePackage nom_Tpack) {
		super(nom_Tpack);
		
	}

	@Override
	public void SetNbLivreAutorise(int nombre) {
		this.nbrLivreAutorise  = nombre;
		
	}

	@Override
	public int getNbrLivreAutorise() {
		return 20;
	}
	@Override
	public int getNbrLivreBonus() {
		// TODO Auto-generated method stub
		return 10;
	}
	

	

}
