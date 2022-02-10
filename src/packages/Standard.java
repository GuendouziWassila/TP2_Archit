package packages;

public class Standard extends Package {

	public Standard(TypePackage nom_Tpack) {
		super(nom_Tpack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNbrLivreAutorise() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int getNbrLivreBonus() {
		// TODO Auto-generated method stub
		return 5;
	}

}
