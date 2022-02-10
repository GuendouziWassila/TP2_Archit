
public abstract class Package  implements InterfaceNbLivreAutorise{
	

	protected TypePackage pack;

	 int nbrLivreAutorise;
	
	public Package(TypePackage nom_Tpack){
		
		this.pack = nom_Tpack;
	}

	public abstract void SetNbLivreAutorise(int nombre);
	
	public abstract int getNbrLivreAutorise();
	
	
}
