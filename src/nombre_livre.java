
public abstract class nombre_livre implements nombre_livre_autorisé{
	 TypePackage pack;

	 int nbrLivreAutorise;
	
	public nombre_livre(TypePackage nom_Tpack){
		
		this.pack = nom_Tpack;
	}

	public abstract void SetNbLivreAutorise(int nombre);
	
	
	public abstract int getNbrLivreAutorise();
	public abstract int getNbrLivreBonus();

}

