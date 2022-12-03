import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;



	public class ViewInscription extends JFrame 
	{
	    private JFrame frame;
	    private JPanel contentPane;
	    private JTextField TxtMat;
	    private JTextField TxtNom;
	    private JTextField TxtPrenom;
	    private JTextField TxtEmail;
	    private JPasswordField TxtPwd;
	    private JTextField TxtIdUniv;
	    private JButton btnSubmit;
	    private JButton btnCancel;
	
	public String getMatricule() {
        return this.TxtMat.getText();
    }
    
    public String getNom() {
        return this.TxtNom.getText();
    }
    
    public String getPrenom() {
        return this.TxtPrenom.getText();
    }
    
    public String getEmail() {
        return this.TxtEmail.getText();
    }
    
    @SuppressWarnings("deprecation")
	public String getPwd() {
        return this.TxtPwd.getText();
    }
    
    public String getId_universite() {
        return this.TxtIdUniv.getText();
    }
}
