package tp2pack;
    import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;


	public class ViewInscription extends JFrame implements ActionListener {

		public ViewInscription ()
		{
			 JFrame f =new JFrame ();
			 JPanel pan = new JPanel ();
			 JLabel lab1 = new JLabel("Matricule");
		     JTextField tf1 = new JTextField();
		     
		     JLabel lab2 = new JLabel("Nom");
		     JTextField tf2 = new JTextField();
		     
		     JLabel lab3 = new JLabel("Prénom");
		     JTextField tf3 = new JTextField();
		     
			 JLabel lab4 = new JLabel("Email");
		     JTextField tf4 = new JTextField();
		     
		     JLabel lab5 = new JLabel("Mot de passe");
		     JPasswordField tf5 = new JPasswordField();

			 JLabel lab6 = new JLabel("ID université");
		     JTextField tf6 = new JTextField();
		     
		     JButton annuler = new JButton ("Annuler");
		     JButton envoyer = new JButton ("Envoyer");
		     
		     pan.add(lab1);
		     pan.add(tf1);
		     
		     pan.add(lab2);
		     pan.add(tf2);
		     
		     pan.add(lab3);
		     pan.add(tf3);
		     
		     pan.add(lab4);
		     pan.add(tf4);
		     
		     pan.add(lab5);
		     pan.add(tf5);
		     
		     pan.add(lab6);
		     pan.add(tf6);
		     
		     pan.add(annuler);
		     pan.add(envoyer);
		     
		     envoyer.addActionListener(this);
		     annuler.addActionListener(this);


		     f.add(pan);
		     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     f.setSize(250, 250);
		     f.setVisible(true);
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			ControleurInscription c = new ControleurInscription();
			c.InscriptionControle();
		}

		
		

	}


