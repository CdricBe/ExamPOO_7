package Club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClubService {

    public boolean creationClub(String nom, String type) {

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);
            Statement state = conn.createStatement();
            Statement state2 = conn.createStatement();

            //query sql qui recupere les infos de la table clubs

            ResultSet resultat = state2.executeQuery("SELECT C_Nom FROM clubs");

            //conditions pour vérifier si la valeur entrée par l'utilisateur est déjà dans la bd

            while(resultat.next()){
                String NomRecup = resultat.getString("C_Nom");

                if(!NomRecup.equals(nom)){
                    state.executeUpdate("INSERT INTO clubs(C_Nom,C_Type) VALUES('"+nom+"','"+type+"')");
                    return true;
                }
                else{
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }



}

