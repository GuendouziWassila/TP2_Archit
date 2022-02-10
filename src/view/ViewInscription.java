package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controleur.AbstractViewInscription;


public class ViewInscription extends AbstractViewInscription {
	private JTextField matricule = new JTextField(10);
	private JTextField nom = new JTextField();
	private JTextField Prénom = new JTextField();
	private JTextField Email = new JTextField();
	private JTextField password = new JTextField();
	private JTextField universite = new JTextField();
	private JButton boutoun1,boutoun2;
	
	
	
	
	public ViewInscription() {
		// TODO Auto-generated constructor stub
		
		
		
		JLabel Titre = new JLabel("Inscription");
		Titre.setForeground(Color.getHSBColor(200, 150, 93));
		JPanel pan = new JPanel ();
		pan.setBackground(Color.getHSBColor(120, 105, 43));
		pan.setLayout(null);
		Titre.setBounds(150, 0, 400, 50);
		Font font1 = new Font ("Garamond", Font.BOLD, 20);
		Titre.setFont(font1);
		pan.add(Titre);
		
		JLabel mat = new JLabel("Matricule :");
		mat.setBounds(50, 50, 100, 25);
		pan.add(mat);
		matricule.setBounds(120, 50, 200, 25);
		pan.add(matricule);
		
		JLabel labnom = new JLabel("Nom :");
		labnom.setBounds(50, 80, 100, 25);
		pan.add(labnom);
		nom.setBounds(120, 80, 200, 25);
		pan.add(nom);
		
		JLabel labprenom = new JLabel("Prénom :");
		labprenom.setBounds(50, 110, 100, 25);
		pan.add(labprenom);
		Prénom.setBounds(120, 110, 200, 25);
		pan.add(Prénom);
		
		JLabel labEmail = new JLabel("Email :");
		labEmail.setBounds(50, 140, 100, 25);
		pan.add(labEmail);
		Email.setBounds(120, 140, 200, 25);
		pan.add(Email);
		
		JLabel passwordL = new JLabel ("Password :");
		passwordL.setBounds(50, 170, 100, 25);
		pan.add(passwordL);
		password.setBounds(120, 170, 200, 25);
		pan.add(password);
		
		JLabel univL = new JLabel ("Université:");
		univL.setBounds(50, 200, 100, 25);
		pan.add(univL);
		universite.setBounds(120, 200, 200, 25);
		pan.add(universite);
		
		boutoun1 = new JButton("Annuler");
		boutoun1.setBounds(120, 230, 100, 25);
		//boutoun1.addActionListener((ActionListener) this);
		pan.add(boutoun1);
		
		boutoun2 = new JButton("Confirmer");
		boutoun2.setBounds(220, 230, 100, 25);
		pan.add(boutoun2);
		
		JFrame j = new JFrame();
		j.getContentPane().add(pan);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("Inscription");
		j.setSize(400, 400);
		j.setResizable(false);
		j.setLocationRelativeTo(null);
		j.setVisible(true);
	}
	@Override
	public int getMat() {
		return Integer.parseInt(matricule.getText());
	}
	@Override
	public String getNom() {
		return nom.getText();
	}
	@Override
	public String getPrenom() {
		return Prénom.getText();
	}
	@Override
	public String getMail() {
		return Email.getText();
	}
	@Override
	public String getPassword() {
		return password.getText();
	}
	@Override
	public int getUniv() {
		return Integer.parseInt(universite.getText());
	}
	public JButton getbtn1() {
		return boutoun1;
	}
	public JButton getbtn2() {
		return boutoun2;
	}
	@Override
	public void addListener() {
		notifyObserver(getbtn1());
		notifyObserver(getbtn2());
	}
	
	
	
	public void displayMessage(String Message) {
		JOptionPane.showMessageDialog(new JFrame(), Message);
	}
	
	public void displayErrorMessage(String Error) {
		JOptionPane.showMessageDialog(new JFrame(), Error,"Error",0);
	}
	
	 public void Rénistialisation() {
	        matricule.setText("");
	        nom.setText("");
	        Prénom.setText("");
	        Email.setText("");
	        password.setText("");
	        universite.setText("");
	    }
	 
	 public boolean champs_validation() {
	        if (matricule.getText().isEmpty() || this.nom.getText().isEmpty() || this.Prénom.getText().isEmpty() || this.Email.getText().isEmpty() || this.password.getText().isEmpty() || this.universite.getText().isEmpty()) {
	            this.displayErrorMessage("veuillez remplir tous les champs");
	            return false;
	        }
	        if (!matricule.getText().matches("-?\\d+") || !universite.getText().matches("-?\\d+")) {
	            this.displayErrorMessage("les champs matricule et universite\u00e9 doivent etre de format num\u00e9riques ");
	            return false;
	        }
	        if (!this.Email.getText().matches("^(.+)@(.+)$")) {
	            this.displayErrorMessage("il faut respecter le format d'un email xxx@xxx.xxx");
	            return false;
	        }
	        return true;
	    }
	
}