public abstract class Package implements IUnuversite {
	
	
	protected TypePackage pack;

	 int nbrLivreAutorise;
	 int nbrLivreBonus;
	
	public Package(TypePackage nom_Tpack){
		
		this.pack = nom_Tpack;
	}

	public abstract void SetNbLivreAutorise(int nombre);
	
	public abstract void SetNbLivrebonus(int nombre);
	
	public abstract int getNbrLivreAutorise();
	
	public abstract int getNbrLivreBonus();

}
	
