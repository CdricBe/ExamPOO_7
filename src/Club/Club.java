package Club;

public class Club {

    //attributs

    private String nom;
    private String type;

    //constructeur

    public Club(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    //getters

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    //setters


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

