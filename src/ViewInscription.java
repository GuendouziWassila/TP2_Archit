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
			 JFrame frame =new JFrame ();
			 JPanel panel = new JPanel ();
			 JLabel lab1 = new JLabel("Matricule");
		     JTextField text1 = new JTextField();
		     
		     JLabel lab2 = new JLabel("Nom");
		     JTextField text2 = new JTextField();
		     
		     JLabel lab3 = new JLabel("Pr�nom");
		     JTextField text3 = new JTextField();
		     
			 JLabel lab4 = new JLabel("Email");
		     JTextField text4 = new JTextField();
		     
		     JLabel lab5 = new JLabel("Mot de passe");
		     JPasswordField text5 = new JPasswordField();

			 JLabel lab6 = new JLabel("ID universite");
		     JTextField text6 = new JTextField();
		     
		     JButton cancel = new JButton ("Cancel");
		     JButton send = new JButton ("Send");
		     
		     panel.add(lab1);
		     panel.add(text1);
		     
		     panel.add(lab2);
		     panel.add(text2);
		     
		     panel.add(lab3);
		     panel.add(text3);
		     
		     panel.add(lab4);
		     panel.add(text4);
		     
		     panel.add(lab5);
		     panel.add(text5);
		     
		     panel.add(lab6);
		     panel.add(text6);
		     
		     panel.add(cancel);
		     panel.add(send);
		     
		


		     frame.add(panel);
		     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     frame.setSize(250, 250);
		     frame.setVisible(true);
		
		}
		
		
}