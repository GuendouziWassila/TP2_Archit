
public class illimite extends Package{

	public illimite() {
		super(TypePackage.Premium);

	}
	
	public illimite(TypePackage nom_Tpack) {
		super(nom_Tpack);
		
	}

	@Override
	public void SetNbLivreAutorise(int nombre) {
		this.nbrLivreAutorise  = nombre;
		
	}

	@Override
	public int getNbrLivreAutorise() {
		return 0;
	}

	

}