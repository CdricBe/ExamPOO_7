package Membre;

public class Membre {

    //Attributs
    private String nomMembre;
    private String prenomMembre;
    private String dateMembre;
    private String clubMembre;

    //Constructeurs
    public Membre(String nomMembre, String prenomMembre, String dateMembre, String clubMembre) {
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.dateMembre = dateMembre;
        this.clubMembre = clubMembre;
    }

    //Getters
    public String getNomMembre() {
        return nomMembre;
    }

    public String getPrenomMembre() {
        return prenomMembre;
    }

    public String getDateMembre() {
        return dateMembre;
    }

    public String getClubMembre() {
        return clubMembre;
    }

    //Setters
    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    public void setDateMembre(String dateMembre) {
        this.dateMembre = dateMembre;
    }

    public void setClubMembre(String clubMembre) {
        this.clubMembre = clubMembre;
    }
}
