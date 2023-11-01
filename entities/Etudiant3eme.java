package entities;

public class Etudiant3eme extends Etudiant {

    private  String branche;


    //getter and setter
    public String getBranche() {
        return branche;}

    public void setBranche(String branche) {
        this.branche = branche;}




    @Override
    public String toString() {
        return "Etudiant3eme{" + super.toString() +
                "branche='" + branche + '\'' +
                '}'; }

    public Etudiant3eme(){} //par defaut
    //TODO6
    public Etudiant3eme(String branche){branche=branche; } //parametere


    //TODO7
    public void ajouterUneAbsence(){
        if ( moyenne >= 0.5F) { moyenne -= 0.5F; }
        else { moyenne = 0.0F;} }

    /*
    @Override
    void getMoyenneDes3A() {
    }

     */

}