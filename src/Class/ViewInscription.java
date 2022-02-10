package Class;

import Abstract.AbstractVienInscription;
import Interface.IEtudiant;
import Interface.IEtudiantRepository;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewInscription extends AbstractVienInscription {

    private JFrame frame;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField matricule;
    private JTextField universite;
    private JTextField passwordField;
    private JButton submitButton;

    public JTextField getFirstname() {
        return this.firstname;
    }

    public JTextField getLastname() {
        return this.lastname;
    }

    public JTextField getEmail() {
        return this.email;
    }

    public JTextField getMatricule() {
        return this.matricule;
    }

    public JButton getSubmitButton() {
        return this.submitButton;
    }

    public JTextField getUniversite() {
        return this.universite;
    }

    public JTextField getPasswordField() {
        return this.passwordField;
    }

    public ViewInscription(IEtudiantRepository ER) {
        this.frame = new JFrame();
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setBounds(450, 190, 1014, 597);
        this.frame.setResizable(false);

        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.frame.setContentPane(contentPane);
        this.contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Registration");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        this.contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("Nom");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        this.contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Prenom");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        this.contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        this.contentPane.add(lblEmailAddress);

        this.firstname = new JTextField();
        this.firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        this.firstname.setBounds(214, 151, 228, 50);
        this.contentPane.add(firstname);
        this.firstname.setColumns(10);

        this.lastname = new JTextField();
        this.lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        this.lastname.setBounds(214, 235, 228, 50);
        this.contentPane.add(lastname);
        this.lastname.setColumns(10);

        this.email = new JTextField();
        this.email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        this.email.setBounds(214, 320, 228, 50);
        this.contentPane.add(email);
        this.email.setColumns(10);

        JLabel lblUsername = new JLabel("Matricule");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        this.contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Mot de pass");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        this.contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Class.Universite");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        this.contentPane.add(lblMobileNumber);

        this.matricule = new JTextField();
        this.matricule.setFont(new Font("Tahoma", Font.PLAIN, 32));
        this.matricule.setBounds(707, 151, 228, 50);
        this.contentPane.add(this.matricule);
        this.matricule.setColumns(10);

        this.universite = new JTextField();
        this.universite.setFont(new Font("Tahoma", Font.PLAIN, 32));
        this.universite.setBounds(707, 320, 228, 50);
        this.contentPane.add(this.universite);
        this.universite.setColumns(10);

        this.passwordField = new JTextField();
        this.passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        this.passwordField.setBounds(707, 235, 228, 50);
        this.contentPane.add(passwordField);

        this.submitButton = new JButton("Registrer");
        this.submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg = "" + firstname;
                ControleurInscription C = new ControleurInscription(ViewInscription.this);
                Boolean result = C.getResult();
                if(result){

                    IEtudiant E = new Etudiant(Integer.parseInt(matricule.getText()), lastname.getText(), firstname.getText(),email.getText(), passwordField.getText(), Integer.parseInt(universite.getText()));
                    try {
                        ER.add((Etudiant) E);
                        JOptionPane.showMessageDialog(submitButton,
                                "Bienvenue, " + msg + " Votre compte est créé avec succès");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        this.submitButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        this.submitButton.setBounds(399, 447, 259, 74);
        this.contentPane.add(this.submitButton);
    }

    public void creatFrame() {
        this.frame.setVisible(true);
    }
}


