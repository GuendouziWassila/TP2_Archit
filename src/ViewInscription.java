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
    private JTextField TextMatricule;
    private JTextField TextNom;
    private JTextField TextPrenom;
    private JTextField TextEmail;
    private JPasswordField TextPwd;
    private JTextField TextIdUnivr;
    private JButton btnSubmit;
    private JButton btnCancel;
    
    public ViewInscription() {
        (this.frame = new JFrame()).setBounds(105, 105, 460, 300);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout(null);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.frame.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel Lable_Matricule = new JLabel("Matricule");
        Lable_Matricule.setBounds(33, 33, 68, 18);
        this.contentPane.add(Lable_Matricule);
        (this.TextMatricule = new JTextField()).setBounds(184, 27, 200, 20);
        this.contentPane.add(this.TextMatricule);
        this.TextMatricule.setColumns(10);
        final JLabel LableNom = new JLabel("Nom");
        LableNom.setBounds(60, 60, 50, 19);
        this.contentPane.add(LableNom);
        (this.TextNom = new JTextField()).setBounds(186, 55, 200, 25);
        this.contentPane.add(this.TextNom);
        this.TextNom.setColumns(10);
        final JLabel LablePrenom = new JLabel("Pr\00c6nom");
        LablePrenom.setBounds(30, 91, 46, 14);
        this.contentPane.add(LablePrenom);
        (this.TextPrenom = new JTextField()).setBounds(186, 55, 200, 25);
        this.contentPane.add(this.TextPrenom);
        this.TextPrenom.setColumns(10);
        final JLabel LableEmail = new JLabel("Email");
        LableEmail.setBounds(30, 126, 46, 14);
        this.contentPane.add(LableEmail);
        (this.TextEmail = new JTextField()).setColumns(10);
        this.TextEmail.setBounds(184, 120, 200, 20);
        this.contentPane.add(this.TextEmail);
        final JLabel LablePwd = new JLabel("mot de passe");
        LablePwd.setBounds(30, 165, 46, 14);
        this.contentPane.add(LablePwd);
        (this.TextPwd = new JPasswordField()).setColumns(10);
        this.TextPwd.setEchoChar('*');
        this.TextPwd.setBounds(184, 159, 200, 20);
        this.contentPane.add(this.TextPwd);
       final JLabel LableId_Univ = new JLabel("Id universit\00c6");
        LableId_Univ.setBounds(34, 240, 115, 14);
        this.contentPane.add(LableId_Univ);
        (this.TextIdUnivr = new JTextField()).setColumns(10);
        this.TextIdUnivr.setBounds(184, 194, 200, 20);
        this.contentPane.add(this.TextIdUniv);
        
      
 
        (this.btnSubmit = new JButton("Ajouter")).setBounds(295, 227, 89, 23);

        this.contentPane.add(this.btnSubmit);
        (this.btnCancel = new JButton("Quitter")).setBounds(184, 227, 89, 23);

        this.contentPane.add(this.btnCancel);
        this.frame.setVisible(true);
        this.TextMatricule.setText("");
        this.TextNom.setText("");
        this.TextPrenom.setText("");
        this.TextEmail.setText("");
        this.TextPwd.setText("");
        this.TextIdUnivr.setText("");
    
    }
    public String getMatricule() {
        return this.TextMatricule.getText();
    }
    
    public String getNom() {
        return this.TextNom.getText();
    }
    
    public String getPrenom() {
        return this.TextPrenom.getText();
    }
    
    public String getEmail() {
        return this.TextEmail.getText();
    }
    
    public String getPwd() {
        return this.TextPwd.getText();
    }
    
    public String getId_universite() {
        return this.TextIdUnivr.getText();
    }
}
