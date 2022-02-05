package com.company;

import javax.swing.*;

public class ControleurInscription {
    public void ShowErreur(String msg) {
        JOptionPane.showMessageDialog(new JFrame(), msg, "Erreur", 0);
    }

    public boolean ControleurInscription(ViewInscription V){
        if (V.getMatriculeText().isEmpty() || V.getLastNameText().isEmpty() || V.getFirstNameText().isEmpty() || V.getEmailTex().isEmpty() || V.getPasswordText().isEmpty() || V.getUniversiteText().isEmpty()) {
            this.ShowErreur("veuillez remplir tous les champs");
            return false;
        }
        if (!V.getMatriculeText().matches("-?\\d+") || !V.getMatriculeText().matches("-?\\d+")) {
            this.ShowErreur("les champs matricule et id universite doivent etre de format numeriques ");
            return false;
        }
        if (!V.getEmailTex().matches("^(.+)@(.+)$")) {
            this.ShowErreur("il faut respecter le format d'un email xxx@xxx.xxx");
            return false;
        }
        return true;
    }
}
