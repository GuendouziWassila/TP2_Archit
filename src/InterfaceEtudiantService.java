import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfaceEtudiantService {
    public boolean inscription (Etudiant etudiant, InterfaceUniversite universite, InterfaceEtudiantRepository etudiantRepository) throws SQLException;
    public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye();
    public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte();

    abstract class AbstractViewInscription {
     public abstract void Inscription();
     public abstract void InitialiserInscription();
    }

    class ControleurInscription {
        public void ShowErreur(String msg) {
            JOptionPane.showMessageDialog(new JFrame(), msg, "Erreur", 0);
        }
        private AbstractViewInscription View;
        private Boolean status;
        public  ControleurInscription(EtudiantRepository.ViewInscription View){
            this.View = View;
            if (View.getMatriculeText().isEmpty() || View.getLastNameText().isEmpty() || View.getFirstNameText().isEmpty() || View.getEmailTex().isEmpty() || View.getPasswordText().isEmpty() || View.getUniversiteText().isEmpty()) {
                this.ShowErreur("veuillez remplir tous les champs");
                setStatus(false);
            }
            if (!View.getMatriculeText().matches("-?\\d+") || !View.getMatriculeText().matches("-?\\d+")) {
                this.ShowErreur("les champs matricule et id universite doivent etre de format numeriques ");
                setStatus(false);
            }
            if (!View.getEmailTex().matches("^(.+)@(.+)$")) {
                this.ShowErreur("il faut respecter le format d'un email xxx@xxx.xxx");
                setStatus(false);
            }
            setStatus(true);
        }
        public boolean getStatus(){return this.status;}

        public void setStatus(Boolean status) {
            this.status = status;
        }
    }
}
