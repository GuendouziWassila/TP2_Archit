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
    
    public ViewInscription() {
        (this.frame = new JFrame()).setBounds(100, 100, 450, 300);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout(null);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.frame.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel Lab_Matricule = new JLabel("Matricule");
        Lab_Matricule.setBounds(30, 33, 68, 17);
        this.contentPane.add(Lab_Matricule);
        (this.TxtMat = new JTextField()).setBounds(184, 27, 200, 20);
        this.contentPane.add(this.TxtMat);
        this.TxtMat.setColumns(10);
        final JLabel LabNom = new JLabel("Nom");
        LabNom.setBounds(30, 60, 46, 14);
        this.contentPane.add(LabNom);
        (this.TxtNom = new JTextField()).setBounds(184, 54, 200, 20);
        this.contentPane.add(this.TxtNom);
        this.TxtNom.setColumns(10);
        final JLabel LabPrenom = new JLabel("Pr\u00e9nom");
        LabPrenom.setBounds(30, 91, 46, 14);
        this.contentPane.add(LabPrenom);
        (this.TxtPrenom = new JTextField()).setBounds(184, 85, 200, 20);
        this.contentPane.add(this.TxtPrenom);
        this.TxtPrenom.setColumns(10);
        final JLabel LabEmail = new JLabel("Email");
        LabEmail.setBounds(30, 126, 46, 14);
        this.contentPane.add(LabEmail);
        (this.TxtEmail = new JTextField()).setColumns(10);
        this.TxtEmail.setBounds(184, 120, 200, 20);
        this.contentPane.add(this.TxtEmail);
        final JLabel LabPwd = new JLabel("mot de passe");
        LabPwd.setBounds(30, 165, 46, 14);
        this.contentPane.add(LabPwd);
        (this.TxtPwd = new JPasswordField()).setColumns(10);
        this.TxtPwd.setEchoChar('*');
        this.TxtPwd.setBounds(184, 159, 200, 20);
        this.contentPane.add(this.TxtPwd);
        final JLabel LabId_Univ = new JLabel("Identifiant universit\u00e9");
        LabId_Univ.setBounds(30, 200, 125, 14);
        this.contentPane.add(LabId_Univ);
        (this.TxtIdUniv = new JTextField()).setColumns(10);
        this.TxtIdUniv.setBounds(184, 194, 200, 20);
        this.contentPane.add(this.TxtIdUniv);
        
      
 
        (this.btnSubmit = new JButton("Ajouter")).setBounds(295, 227, 89, 23);

        this.contentPane.add(this.btnSubmit);
        (this.btnCancel = new JButton("Quitter")).setBounds(184, 227, 89, 23);

        this.contentPane.add(this.btnCancel);
        this.frame.setVisible(true);
        this.TxtMat.setText("");
        this.TxtNom.setText("");
        this.TxtPrenom.setText("");
        this.TxtEmail.setText("");
        this.TxtPwd.setText("");
        this.TxtIdUniv.setText("");
    
    }
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
    
    public String getPwd() {
        return this.TxtPwd.getText();
    }
    
    public String getId_universite() {
        return this.TxtIdUniv.getText();
    }
}