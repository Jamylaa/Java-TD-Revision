package entities;

public class Etudiant {


   int identifiant;
     String nom;
    public String prenom;
    public static float moyenne;
    private Ecole ecole;
    //public Ecole ecoleActuelle;


// getters and setters
    public int getIdentifiant() {
        return identifiant; }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant; }


    public String getNom() { return nom;}

    public void setNom(String nom) {
        this.nom = nom; }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }


    public static float getMoyenne() { return moyenne;}

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne; }







    //constructeur

    public Etudiant(){} //par defaut
    public Etudiant(int identifiant,String nom, String prenom, float moyenne){} //parametere

    

    @Override
//TODO3
public String toString() {
        return "Etudiant{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}'; }

    //TODO2
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false; }
        if (obj.getClass() == Etudiant.class){
            Etudiant e = (Etudiant) obj;
            return ( e.getNom() == this.getNom()) &&
                    ( e.getIdentifiant() == this.getIdentifiant() );
        }
        return false;
    }





    //TODO4
    void ajouterUneAbsence() {}

    public float getMoyenneDes3A(){

        return 0;}

//TODO 19


    public void changerEcole(Ecole nouvelleEcole) {
        if (nouvelleEcole != null) {
            this.ecole = nouvelleEcole;
            System.out.println(this.nom + " a changé d'école. Nouvelle école : " + nouvelleEcole.getNom());
        } else {
            System.out.println("Erreur : L'école spécifiée est invalide.");
        }
    }



  }



