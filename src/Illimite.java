
public class Illimite extends Pack{
	public Illimite() {
		super(Package.Premium);

	}
	
	public Illimite(Package nom_pack) {
		super(nom_pack);
		
	}

	
	public void SetNbLivreAutorise(int nmbr) {
		this.nbrLivreAutorise  = nmbr;
		
	}

	
	public int getNbrLivreAutorise() {
		return 0;
	}

	public int getNbrLivreBonus() {
		return 0;
	}
	
	
	
}
