package entities;
import java.util.Arrays;

//import Etudiant;
public class Ecole {

    public String nom;
    public Etudiant[] etudiants;
    public int nbEtudiants;


    //TODO 12
    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[500];
        this.nbEtudiants = 0; }


    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom;}


    public Ecole() {} //par defaut


    //TODO 13
    public void ajouterEtudiant(Etudiant etudiant) {

        if (nbEtudiants < 500) {
            etudiants[nbEtudiants] = etudiant;
            nbEtudiants++;
        } else {
            System.out.println(" *********   L'école est saturé !    ******** ");
        }

    }


    //TODO 15
    public boolean ajoutEtudiant(Etudiant e) {
        if (rechercherEtudiant(e) == -1) {
            if (nbEtudiants < 500) {
                etudiants[nbEtudiants] = e;
                nbEtudiants++;
                return true;
            } else {
                System.out.println("***  impossible d'ajouter plus d'étudiants, l'école est pleine !  *** ");
                return false;
            }
        } else {
            System.out.println("L'étudiant est déjà inscrit à l'école.");
            return false;
        }
    }


    //TODO 14
    public int rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < nbEtudiants; i++) {
            if (etudiants[i].equals(e)) {
                return i;
            }
        }
        return -1; // pas d étudiant
    }


    public float getMoyenne3A(float moy3A) {
        float Sommemoyenne = 0.0f;
        int nbrEtudiants3A = 0;


        for (int i = 0; i < nbEtudiants; i++) {

            if (etudiants[i] instanceof Etudiant3eme) {
                Sommemoyenne += etudiants[i].getMoyenne();
                nbrEtudiants3A++;
            } else if (nbrEtudiants3A == 0) {
                return 0;
            }

        }
        return Sommemoyenne / nbrEtudiants3A;

    }


    //TODO 17
    public float moyenneSalaireAlternants() {

        float SommeSalaire = 0.0f;
        int nbrAlternants = 0;


        for (int i = 0; i < nbEtudiants; i++) {

            if (etudiants[i] instanceof EtudiantAlternance) {
                SommeSalaire += ((EtudiantAlternance) etudiants[i]).getSalaire();
                nbrAlternants++;
            } else if (nbrAlternants == 0) {
                return 0;
            }

        }

        return SommeSalaire / nbrAlternants;
    }


    //TODO 18

    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", etudiants=" + Arrays.toString(etudiants) +
                ", nbEtudiants=" + nbEtudiants +
                '}';
    }



    /*
    public void changerEcole(Ecole nouvelleEcole) {
        if (nouvelleEcole != null) {
            ecoleActuelle.retirerEtudiant(this);
            nouvelleEcole.ajouterEtudiant(this);
            ecoleActuelle = nouvelleEcole;
            System.out.println(nom + " a changé d'école. Nouvelle école : " + nouvelleEcole.getNom());
        } else {
            System.out.println("Erreur : L'école spécifiée est invalide.");
        }
    }

     */






    }







