
public class Pack implements INbLivreAutorise{
{
	 Package pack;

	 int nbrLivreAutorise;
	
	public Pack(Package nom_pack){
		
		this.pack = nom_pack;
	}

	public abstract void SetNbLivreAutorise(int nmbr);
	
	
	public abstract int getNbrLivreAutorise();
	public abstract int getNbrLivreBonus();
}
