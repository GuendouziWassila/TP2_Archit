public class Premuim extends Package {

	public class Premium extends Package {

	public Premium(TypePackage Tpack) {
		super(Tpack);
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
