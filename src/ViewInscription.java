import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ViewInscription extends JFrame {
	JTextField matricule = new JTextField(10);
	JTextField nom = new JTextField();
	JTextField Prénom = new JTextField();
	JTextField Email = new JTextField();
	JTextField password = new JTextField();
	JTextField universite = new JTextField();
	JButton boutoun1,boutoun2;
	
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
		pan.add(boutoun1);
		
		boutoun2 = new JButton("Confirmer");
		boutoun2.setBounds(220, 230, 100, 25);
		pan.add(boutoun2);
		
		
		this.getContentPane().add(pan);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Inscription");
		this.setSize(400, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public int getMat() {
		return Integer.parseInt(matricule.getText());
	}
	public String getNom() {
		return nom.getText();
	}
	public String getPrenom() {
		return Prénom.getText();
	}
	public String getMail() {
		return Email.getText();
	}
	public String getPassword() {
		return password.getText();
	}
	public int getUniv() {
		return Integer.parseInt(universite.getText());
	}
	void addConfirmationListener(ActionListener listenerForConfirmation) {
		boutoun2.addActionListener(listenerForConfirmation);
	}
	void addAnlListener(ActionListener listenerForAnnuler) {
		boutoun1.addActionListener(listenerForAnnuler);
	}
	void displayMessage(String Message) {
		JOptionPane.showMessageDialog(this, Message);
	}
	
	void displayErrorMessage(String Error) {
		JOptionPane.showMessageDialog(this, Error,"Error",0);
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
	            this.displayErrorMessage("les champs matricule et id universit\u00e9 doivent etre de format num\u00e9riques ");
	            return false;
	        }
	        if (!this.Email.getText().matches("^(.+)@(.+)$")) {
	            this.displayErrorMessage("il faut respecter le format d'un email xxx@xxx.xxx");
	            return false;
	        }
	        return true;
	    }
	
}
