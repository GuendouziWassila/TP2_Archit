
public class Universite implements UniversiteInterf{

 private int i_univ; //identifiant unique de l'universit�
 private String nom;
 private TypePackage pack;
 
	public Universite(int i_univ, String nom, TypePackage pack) {
	super();
	this.i_univ = i_univ;
	this.nom = nom;
	this.pack = pack;
} 
	@Override
	public int getI_univ() {
		return i_univ;
	}
	
	public void setI_univ(int i_univ) {
		this.i_univ = i_univ;
	}
	@Override
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public TypePackage getPack() {
		return pack;
	}
	public void setPack(TypePackage pack) {
		this.pack = pack;
	}
	 
 

 
 
}
