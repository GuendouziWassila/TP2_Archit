
public abstract class Package implements InterfaceNbLivreAutorise{

	 TypePackage pack;

	 int nbrLivreAutorise;
	
	public Package(TypePackage nom_Tpack){
		
		this.pack = nom_Tpack;
	}

	public abstract void SetNbLivreAutorise(int nombre);
	
	
	public abstract int getNbrLivreAutorise();
	public abstract int getNbrLivreBonus();

}
