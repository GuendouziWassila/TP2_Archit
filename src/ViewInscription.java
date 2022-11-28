import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Image;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class ViewInscription extends JFrame {
    private JFrame Jframe;
    private JPanel Panel;
    private JTextField Matricule;
    private JTextField Nom;
    private JTextField Prenom;
    private JTextField Email;
    private JPasswordField Pwd;
    private JTextField UnivId;
    private JButton valider;
    private JButton annuler;
    private void initialiser() {
    	// Frame
        this.Jframe = new JFrame();
        Jframe.setBounds(400, 400, 500, 350);
        Jframe.setResizable(false);
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jframe.getContentPane().setLayout(null);
        // Container(panel)
        this.Panel = new JPanel();
        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        Jframe.setContentPane(this.Panel);
        Panel.setLayout(null);
        // lablel text Matricule
        final JLabel LabMatricule = new JLabel("Matricule");
        LabMatricule.setBounds(30, 33, 68, 17);
        this.Matricule = new JTextField("");
        Matricule.setBounds(184, 27, 200, 20);
        Matricule.setColumns(10);
     // lablel text Nom
        final JLabel LabNom = new JLabel("Nom");
        LabNom.setBounds(30, 60, 46, 14);
        this.Nom = new JTextField("");
        Nom.setBounds(184, 54, 200, 20);
        Nom.setColumns(10);
     // lablel text prenom
        final JLabel LabPrenom = new JLabel("Pr\u00e9nom");
        LabPrenom.setBounds(30, 91, 46, 14);
        this.Prenom = new JTextField("");
        Prenom.setBounds(184, 85, 200, 20);
        Prenom.setColumns(10);
     // lablel text Email
        final JLabel LabEmail = new JLabel("Email");
        LabEmail.setBounds(30, 126, 46, 14);
        this.Email = new JTextField("");
        Email.setColumns(10);
        Email.setBounds(184, 120, 200, 20);
     // lablel text Mot de passe
        final JLabel LabPwd = new JLabel("Mots de passe");
        LabPwd.setBounds(30, 165, 90, 14);
        this.Pwd = new JPasswordField("");
        Pwd.setColumns(10);
        Pwd.setEchoChar('*');
        Pwd.setBounds(184, 159, 200, 20);
     // lablel text UnivId
        final JLabel LabId_Univ = new JLabel("Identifiant universit\u00e9");
        LabId_Univ.setBounds(30, 200, 125, 14);
        this.UnivId = new JTextField("");
        UnivId.setColumns(10);
        UnivId.setBounds(184, 194, 200, 20);
        
     // Bouton valider
        
        
        Image imgV = new ImageIcon("E:\\TPArchiGit\\TP2\\TP2_Archit\\src\\valider.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        Icon iconV = new ImageIcon(imgV);
        valider = new JButton("valider" ,iconV);
        valider.setBounds(270, 250, 120, 30);
        
     // Bouton annuler
        Image imgA = new ImageIcon("E:\\TPArchiGit\\TP2\\TP2_Archit\\src\\annuler.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        Icon iconA= new ImageIcon(imgA);
        this.annuler = new JButton("Annuler",iconA);
        annuler.setBounds(120, 250, 120, 30);
        this.Panel.add(LabMatricule);
        this.Panel.add(Matricule);
        this.Panel.add(LabNom);
        this.Panel.add(Nom);
        this.Panel.add(LabPrenom);
        this.Panel.add(Prenom);
        this.Panel.add(LabEmail);
        this.Panel.add(Email);
        this.Panel.add(LabPwd);
        this.Panel.add(Pwd);
        this.Panel.add(LabId_Univ);
        this.Panel.add(UnivId);
        this.Panel.add(valider);
        this.Panel.add(annuler);
    }

    boolean champsValides() {
        if (Get_Mat().isEmpty() || Get_Name().isEmpty() || Get_Prenom().isEmpty() || Get_email().isEmpty() || Get_pwd().isEmpty() || Get_id_univ().isEmpty()) {
            this.ShowErreur("Veuillez remplir tous les champs!");
            return false;
        }
        if (!this.Matricule.getText().matches("-?\\d+") || !this.UnivId.getText().matches("-?\\d+")) {
            this.ShowErreur("Le matricule et id université doivent être de format numériques! ");
            return false;
        }
        if (!this.Email.getText().matches("^(.+)@(.+)$")) {
            this.ShowErreur("Email invalide !");
            return false;
        }
        return true;
    }
    public void Show_InscriptionForm() {
        this.initialiser();
        this.Jframe.setVisible(true);
    }
    public void Annuler_Inscription() {
        this.Jframe.dispose();
    }
    void addValiderListener(ActionListener listener) {
    	valider.addActionListener(listener);
    }
    void addAnnulerListener(ActionListener listener) {
    	annuler.addActionListener(listener);
    }
    public void Reset_Champs() {
        this.Matricule.setText("");
        this.Nom.setText("");
        this.Prenom.setText("");
        this.Email.setText("");
        this.Pwd.setText("");
        this.UnivId.setText("");
    }
    public void ShowDialog(final String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
    public void ShowErreur(final String msg) {
        JOptionPane.showMessageDialog(this, msg, "Erreur", 0);
    }
    public String Get_Mat() {
        return this.Matricule.getText();
    }
    public String Get_Name() {
        return this.Nom.getText();
    }
    public String Get_Prenom() {
        return this.Prenom.getText();
    }
    public String Get_email() {
        return this.Email.getText();
    }

	
	public String Get_pwd() {
        return this.Pwd.getText();
    }

    public String Get_id_univ() {
        return this.UnivId.getText();
    }
}