import Classes.AffichageComposite;
import Classes.AffichageDate;
import Classes.AffichageEcran;
import Classes.AffichageFile;
import Classes.Etudiant;
import Classes.EtudiantRepository;
import Classes.EtudiantService;
import Classes.Universite;
import Classes.UniversiteRepository;
import Classes.ViewInscription;
import Interfaces.IJournal;
import Interfaces.InterfaceEtudiantRepository;
import Interfaces.InterfaceEtudiantService;
import Interfaces.InterfaceUniversite;
import Interfaces.InterfaceUniversiteRepository;
import Interfaces.TypePackage;

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

        ViewInscription V = new ViewInscription(etudiantRepository);
        try {
            serv.inscription(etudiant,universite, etudiantRepository);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

