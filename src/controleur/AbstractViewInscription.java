package controleur;




import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public abstract class AbstractViewInscription  {
	ArrayList<ActionListener> tab = new ArrayList<ActionListener>();
	 

	public void registre(ActionListener a) {
			if(!tab.contains(a)){
				 tab.add(a);
				 }
			}
	public void unregistre(ActionListener a) {
		int j = tab.indexOf(a);
		tab.remove(j);
		
	}
	public void notifyObserver(JButton b) {
		for(ActionListener tab : tab) {
			b.addActionListener(tab);
	}
}
	public abstract JButton getbtn2();
	public abstract boolean champs_validation();
	public abstract int getMat();
	public abstract String getNom();
	public abstract String getPrenom();
	public abstract String getMail();
	public abstract String getPassword();
	public abstract int getUniv();
	public abstract void displayMessage(String string);
	public abstract void Rénistialisation();
	public abstract void displayErrorMessage(String string);
	public abstract JButton getbtn1();
	public abstract void addListener();
}
