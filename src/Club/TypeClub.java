package Club;

public class TypeClub {

    //attributs

    private String nom;


    //constructeur

    public TypeClub(String nom) {
        this.nom = nom;
    }

    //getter et setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "TypeClub{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
