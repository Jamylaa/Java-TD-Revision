package entities;

public class EtudiantAlternance extends Etudiant{


    private int salaire;


    //getter and setter
    public int getSalaire() { return salaire;}

    public void setSalaire(int salaire) {this.salaire = salaire; }


    //TODO 11
    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                "} " + super.toString();
    }

    public EtudiantAlternance(){} //par defaut
    //TODO 9
    public EtudiantAlternance(int salaire){ } //parametere

    //TODO 10
    @Override
    public void ajouterUneAbsence(){
        if ( salaire >= 50) { salaire -= 50; }
        else { salaire = 0;}
    }




}
