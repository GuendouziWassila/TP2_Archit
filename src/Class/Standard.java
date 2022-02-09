package Class;

public class Standard extends Package {

	public Standard(TypePackage Tpack) {
		super(Tpack);
	}
	@Override
	public int getNbrLivreAutorise() {
		return 10;
	}
	@Override
	public int getNbrLivreBonus() {
		return 5;
	}
}