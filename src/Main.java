import Affichages.*;
import Packages.TypePackage;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        AffichageComposite AffichageListes = new AffichageComposite();
        IJournal AffichageEcran = new AffichageEcran("Message");
        IJournal AffichageDate = new AffichageDate();
        IJournal AffichageFile = new AffichageFile();

        AffichageListes.addAffichage(AffichageFile);
        AffichageListes.addAffichage(AffichageEcran);
        AffichageListes.addAffichage(AffichageDate);

        InterfaceEtudiantRepository etudiantRepository = new EtudiantRepository(AffichageListes);
        InterfaceUniversiteRepository universiteRepository = new UniversiteRepository(AffichageListes);
        InterfaceEtudiantService serv=new EtudiantService(etudiantRepository,universiteRepository, AffichageListes);

        Etudiant etudiant = new Etudiant(2, "Guendouziiiii", "wassila", "guen@gmail.com", "xxxx", 1);
        InterfaceUniversite universite = new Universite(2,"Benyoucef Ben Khedda", TypePackage.Standard);

        EtudiantRepository.ViewInscription V = new EtudiantRepository.ViewInscription(etudiantRepository);
        try {
            serv.inscription(etudiant,universite, etudiantRepository);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

