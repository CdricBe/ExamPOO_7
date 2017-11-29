package Club;

public class Club {

    //attributs


    private int id;
    private String nom;
    private String type;

    //constructeur

    public Club(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }


    //getters

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }


    //setters


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

