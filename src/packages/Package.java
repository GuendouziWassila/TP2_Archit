package packages;

public abstract class Package {
	TypePackage pack;

	public Package(TypePackage nom_Tpack){
		
		this.pack = nom_Tpack;
	}

	public abstract int getNbrLivreAutorise();
	
	public abstract int getNbrLivreBonus();
}
