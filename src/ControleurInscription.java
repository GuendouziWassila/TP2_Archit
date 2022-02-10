import javax.swing.*;

public class ControleurInscription {

    private boolean result;

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public ControleurInscription(ViewInscription View) {
        if (View.getMatricule().getText().isEmpty() || View.getLastname().getText().isEmpty() || View.getFirstname().getText().isEmpty() || View.getEmail().getText().isEmpty() || View.getPasswordField().getText().isEmpty() || View.getUniversite().getText().isEmpty()) {
            JOptionPane.showMessageDialog(View.getSubmitButton(), "veuillez remplir tous les champs");
            setResult(false);
        } else {
            if (!View.getMatricule().getText().matches("-?\\d+") || !View.getUniversite().getText().matches("-?\\d+")) {
                JOptionPane.showMessageDialog(View.getSubmitButton(), "les champs matricule et id universite doivent etre de format numeriques ");
                setResult(false);
            } else {
                if (!View.getEmail().getText().matches("^(.+)@(.+)$")) {
                    JOptionPane.showMessageDialog(View.getSubmitButton(), "il faut respecter le format d'un email xxx@xxx.xxx");
                    setResult(false);
                } else {
                    setResult(true);
                }
            }
        }
    }
}

