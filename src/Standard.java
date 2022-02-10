
public class Standard extends Package{

	public Standard() {
     	super(TypePackage.Standard);
	}
	
	public Standard(TypePackage type_p) {
		super(type_p);
	}
	@Override
	public void SetNbLivreAutorise(int nombre) {
		this.nbrLivreAutorise  = nombre;		
	}
	@Override
	public int getNbrLivreAutorise() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
