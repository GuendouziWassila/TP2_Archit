import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewInscription extends JFrame {
	private JLabel Matricule = new JLabel("Matricule");
	    private JTextField matricule  = new JTextField(30);
	    private JLabel Nom = new JLabel("Nom");
	    private JTextField nom = new JTextField(30);
	    private JLabel Prenom = new JLabel("Prenom");
	    private JTextField prenom = new JTextField(30);
	    private JLabel Email = new JLabel("Email");
	    private JTextField email = new JTextField(30);
	    private JLabel Pwd = new JLabel("password");
	    private JTextField pwd = new JTextField(30);
	    private JLabel Id_univ = new JLabel("id universite");
	    private JTextField id_univ = new JTextField(30);
	    private JButton insert = new JButton("inscription");
	
	    ViewInscription(){
	    	JPanel insertPanel = new JPanel();
	    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	this.setSize(600, 600);
	    	this.setLocationRelativeTo(null);
	    	insertPanel.setLayout(null);
	    	Matricule.setBounds(5,5,60, 50);
	    	insertPanel.add(Matricule);
	    	matricule.setBounds(90,15,300,30);
	    	insertPanel.add(matricule);
	    	Nom.setBounds(5,65,60, 50);
	    	insertPanel.add(Nom);
	    	nom.setBounds(90,70,300,30);
	    	insertPanel.add(nom);
	    	Prenom.setBounds(5,115,60, 50);
	    	insertPanel.add(Prenom);
	    	prenom.setBounds(90,120,300,30);
	    	insertPanel.add(prenom);
	    	Email.setBounds(5,165,60, 50);
	    	insertPanel.add(Email);
	    	email.setBounds(90,170,300,30);
	    	insertPanel.add(email);
	    	Pwd.setBounds(5,210,60, 50);
	    	insertPanel.add(Pwd);
	    	pwd.setBounds(90,215,300,30);
	    	insertPanel.add(pwd);
	    	Id_univ.setBounds(5,265,80, 50);
	    	insertPanel.add(Id_univ);
	    	id_univ.setBounds(110,270,300,30);
	    	insertPanel.add(id_univ);
	    	insert.setBounds(200,350,100,30);
	    	insertPanel.add(insert);
	    	this.add(insertPanel);  	
	    }

		public int getMatricule() {
			return Integer.parseInt(matricule.getText());
		}

		public String getNom() {
			return nom.getText();
		}

		public String getPrenom() {
			return prenom.getText();
		}

		public String getEmail() {
			return email.getText();
		}

		public String getPwd() {
			return pwd.getText();
		}

		public int getId_univ() {
			return Integer.parseInt(id_univ.getText());
		}
        
		 void addInsertListener(ActionListener listenForInsertButton){
 
			         insert.addActionListener(listenForInsertButton);
	 
			     }			 
			     void displayErrorMessage(String errorMessage){
			 
			   
			         JOptionPane.showMessageDialog(this, errorMessage);      
			    }


}
