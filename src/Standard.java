
public class Standard extends Package {

	public Standard() {
     	super(TypePackage.Standard);
	}
	
	public Standard(TypePackage type_p) {
		super(type_p);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void SetNbLivreAutorise(int nombre) {
		// TODO Auto-generated method stub
		this.nbrLivreAutorise  = nombre;
		
	}

	@Override
	public int getNbrLivreAutorise() {
		// TODO Auto-generated method stub
		return 20;
	}


}
