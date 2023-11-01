package main;

import entities.Ecole;
import entities.Etudiant;
import entities.Etudiant3eme;
import entities.EtudiantAlternance;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Etude {
    public static void main(String[] args) {

        System.out.println(" ********* affichage des étudiants  **********  ");
/*
        Etudiant e = new Etudiant();
        System.out.println("   Constructeur par defaut ");

        Etudiant e1 = new Etudiant(4, "BAK", "jamila", 12.01F);
        System.out.println("etudiant e1 est le suivant : "  + e1);


        Etudiant3eme etudiant3 = new Etudiant3eme("Info");
        System.out.println("     Constructeur paramétré    ");

        EtudiantAlternance etudiantalter = new EtudiantAlternance(1000);
        System.out.println(etudiantalter);


        System.out.println(" ********* affichage de l école **********  ");

        Ecole ec = new Ecole();
        System.out.println("  Constructeur par défaut   ");

        Ecole ec1 = new Ecole("Esprit");
        Ecole ec2 = new Ecole("Tek-up");

        System.out.println( ec1);
        System.out.println( ec2);
*/
        Ecole ec1 = new Ecole("Esprit");
        //Etudiant e1 = new Etudiant(4, "BAK", "jamila", 12.01F);
        Etudiant3eme etudiant1 = new Etudiant3eme("Info");
        Etudiant3eme etudiant12 = new Etudiant3eme("Mecatronique");
        EtudiantAlternance etudiant4 = new EtudiantAlternance(1000);
        EtudiantAlternance etudiant6 = new EtudiantAlternance(500);
        EtudiantAlternance etudiant5 = new EtudiantAlternance();
        EtudiantAlternance etudiant7 = new EtudiantAlternance(1950);

        Etudiant3eme etudiant = new Etudiant3eme();
        System.out.println("****** Absence de l étudiant en 3ème  *******");


        etudiant.setMoyenne(10.0F); // moyenne initiale
        System.out.println("Moyenne avant l'absence : " + etudiant.getMoyenne());
        // ajouter une absence
        etudiant.ajouterUneAbsence();
        System.out.println("Moyenne avant l'absence : " + Etudiant.getMoyenne());


        System.out.println("****** Salaire de l étudiant alternant *******");

        etudiant7.setSalaire(1000);
        System.out.println("  Salaire avant l'enlevement : " + etudiant7.getSalaire());
        etudiant7.ajouterUneAbsence();
        System.out.println("  Salaire aprés l'enlevement: " + etudiant7.getSalaire());


        ec1.ajouterEtudiant(etudiant);
        ec1.ajouterEtudiant(etudiant12);
        ec1.ajouterEtudiant(etudiant4);
        ec1.ajouterEtudiant(etudiant7);
        ec1.ajouterEtudiant(etudiant6);
        ec1.ajouterEtudiant(etudiant5);


        int indice = ec1.rechercherEtudiant(etudiant12);
        if (indice != -1) {
            System.out.println("L'étudiant 2 a " +
                    "été trouvé à l'indice : " + indice);
        } else {
            System.out.println("L'étudiant 2 n'a pas été trouvé.");
        }


        float moyenne = etudiant.getMoyenneDes3A();
        System.out.println("La moyenne des étudiants 3A est :  " + moyenne);


        Ecole ecoleA = new Ecole("Ecole A");
        Ecole ecoleB = new Ecole("Ecole B");

        //Etudiant etudiant8 = new Etudiant("Alice", ecoleA);
        //Etudiant etudiant2 = new Etudiant("Bob", ecoleA);

        etudiant1.changerEcole(ecoleB);
/*
        System.out.println(etudiant1.getEcole().getNom());
        System.out.println(etudiant2.getEcole().getNom());



 */


    }
}