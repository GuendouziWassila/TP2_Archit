# TP2_Archit

Objectif. Apprendre à appliquer les principes SOLID et les patrons de conception afin d’améliorer la cohésion et le couplage.
Enoncé. Le système étudié dans ce tp est le système d’une bibliothèque numérique qui fournit des livres électroniques (e-book). Plusieurs universités mets ce système à la disposition de leurs étudiants. L’utilisateur (l’étudiant) peut se connecter au système en utilisant les paramètres donnés par l’université et télécharger des livres.
De plus, le nombre des livres que l’étudiant peut télécharger est limité à un nombre fixe chaque mois (c’est le nombre de livre mensuel autorisés). Cela dépend du forfait (packageType) acheté par l'université à laquelle appartient l'étudiant qui peut être : limité standard, limité premium ou illimité. Il est à noter que d’autre types de forfait peuvent s’ajouter au système selon le besoin.
Au début (à l’inscription de l’étudiant), le nombre de livre mensuel autorisé est égale à 10 quand le forfait est standard, à 20 quand le forfait est premium et à zéro quand le forfait est illimité. De plus, l’étudiant avec un forfait limité peut bénéficier d’un bonus qui augmentera le nombre de livres mensuel autorisé. L’augmentation dépend du forfait de l’université, on augmente par 5 quand le forfait est Standard et par 10 quand il est premium.
Utilisez le Git
1. Vous devez récupérez une copie du dépôt dont le lien est donné ci-dessous sur votre compte en utilisant le Fork
Le lien du dépôt est : https://github.com/GuendouziWassila/TP2_Archit.git
2. Clonez cette copie afin d'obtenir un dépot local
3. Sur le Git Bash, placez-vous dans ce dépôt local
4. Accéder au code et faire une modification (ajouter un simple commentaire par exemple)
5. Faite les commits demandé et à chaque fois un push
6. Demander un pull request afin d’intégrer les changements que vous avez proposé à la version original du projet
Questions
1. Donnez le diagramme de dépendance entre ces classes
2. Utilisez le patron singleton dans la classe « DBConnection » pour avoir un seul point d’accès à la base de données (une seule base de données).
3. Appliquez le Commit et push pour mettre à jour le code sur GitHub
4. Appliquez le principe de l’inversion de contrôle pour améliorer ce code. Expliquez l’objectif de cette amélioration.
5. Modifiez le programme principal et exécutez
6. Appliquez le Commit et push pour mettre à jour le code sur GitHub
Dans cette application, la gestion du journal se fait par des affichages sur l’écran, comme c’est le cas dans la méthode « inscription » de la classe « EtudiantService » et la méthode « add » de la classe «EtudiantRepository ». On souhaite extraire de ces classes les détails d’implémentation du journal. Pour cela nous utilisons une interface « IJournal » contenant une méthode abstraite avec la signature suivante void outPut_Msg (String message). On veut créer des classes qui vont implémenter cette interface :
 Une classe qui permet d’afficher tous les messages directement sur l’écran.
 Une classe qui permet d’afficher tous les messages sur un fichier.
 Une classe qui permet d’enrichir le message avec la date et la classe qui a généré ce message.
 Une classe qui permet d’afficher les messages sur différents types d’output en même temps, par exemple sur l’écran, sur le fichier et sur d’autre si l’on veut ajouter.
7. Implémentez ces classes et modifiez le code des classes qui utilisent le journal (pour la quatrième classe il s’agit d’un patron composite).
8. Modifiez le programme principal afin d’afficher le journal sur l’écran et sur un fichier en même temps avec un message détaillant la date et la classe.
9. Appliquez le Commit et push pour mettre à jour le code sur GitHub
La méthode « inscription » de la classe « EtudiantService » est chargée d’ajouter un étudiant mais aussi elle vérifie le format de l’email, vérifie l’existence de l’email et du matricule et aussi elle initialise le nombre de livre mensuel autorisé.
10. Analysez chacune de ses responsabilités, puis décidez pour chacune si vous la gardez dans la méthode « inscription » ou l’affectez à une autre classe.
11. Appliquez le Commit et push pour mettre à jour le code sur GitHub
L’étudiant peut bénéficier d’un bonus qui augmentera le nombre de livres mensuel autorisé comme expliqué plus haut.
12. Ajoutez dans la classe « Etudiant » une méthode qui implémente ce besoin.
13. Ajoutez dans la classe « EtudiantService » une méthode qui permet d’ajouter le bonus à tous les étudiants avec forfait limité standard et limité premium
14. Appliquez le Commit et push pour mettre à jour le code sur GitHub
A l’initialisation du nombre de livre mensuel autorisé ou à l’ajout du bonus, les traitements dans les deux cas dépendent du forfait de l’université à laquelle appartient l’étudiant.
15. Analysez le code de ces deux fonctionnalités et expliquez le problème qui se trouve dans ce code.
16. Utilisez l’héritage et l’abstraction afin de proposer une solution (respectez le principe LSP).
17. Appliquez le Commit et push pour mettre à jour le code sur GitHub
18. Utilisez le patron Abstract Factory afin de finaliser votre solution
19. Appliquez le Commit et push pour mettre à jour le code sur GitHub
On souhaite organiser notre application selon le patron d’architecture MVC (Modèle/vue/contrôleur). Pour la partie vue de l’application en utilise java Swing.
20. Implémenter la classe « ViewInscription » qui permet de gérer la présentation du formulaire d’inscription.
21. Implémenter une classe « ControleurInscription » qui permet de gérer les traitements lié à l’inscription qui sont déclenchés par le formulaire d’inscription. Cette classe permet de recevoir les requêtes des utilisateurs et de les traiter en assurant la communication entre le modèle et la vue.
22. Appliquez le Commit et push pour mettre à jour le code sur GitHub
23. On souhaite que le contrôleur « ControleurInscription » dépend de l’abstraction de la présentation et non pas de son implémentation. Comment peut-on réaliser ça ?
24. Ecrivez un nouveau programme principal «MainAppMvc» afin de tester l’application. Ce programme permet la création des objets de l’application et le lancement de la fenêtre d‘inscription.
25. Appliquez le Commit et push pour mettre à jour le code sur GitHub
26. Organisez vos classes en packages
27. Donnez le diagramme de dépendance entre les packages.
28. Tester la fonction d’inscription par JUnit
29. Ajouter la gestion des exceptions à votre projet
30. Appliquez le Commit et push pour mettre à jour le code sur GitHub
