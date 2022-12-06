package Class;
public abstract class Package {

	TypePackage pack;

	public Package(TypePackage Tpack){
		this.pack = Tpack;
	}

	public abstract int getNbrLivreAutorise();
	public abstract int getNbrLivreBonus();
}