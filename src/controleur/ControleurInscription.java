package controleur;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;

import Services.Etudiant;
import Services.EtudiantService;
import Services.InterfaceEtudiant;

public class ControleurInscription implements ActionListener {
	private AbstractViewInscription theView;
	private EtudiantService EService;
	
	public ControleurInscription(AbstractViewInscription theView,EtudiantService EService) {
		this.theView = theView;
		this.EService = EService;
	}
	
	protected void finalize() {
		theView.unregistre(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == theView.getbtn2()) {
		if(theView.champs_validation()) {
			int matricule = theView.getMat();
			String nom = theView.getNom();
			String prenom = theView.getPrenom();
			String email = theView.getMail();
			String password = theView.getPassword();
			int ID_Univ = theView.getUniv();
			InterfaceEtudiant Etudiant = new Etudiant(matricule,nom,prenom,email,password,ID_Univ);
			try {
				if(EService.inscription(Etudiant)) {
					theView.displayMessage("Etudiant ajouté avec succés !");
					theView.Rénistialisation();
				}else {
					theView.displayErrorMessage("Il y a un problème Matricule ou Email existe déja !");
				}				
			} catch (SQLException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			}
		}
		if (e.getSource() == theView.getbtn1()) { 
			theView.Rénistialisation();
		}
			
	}}
	