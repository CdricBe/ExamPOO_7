package Club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AffichageClub {

    // fonction recupere club

    public List<Club> recupereClub() {

        //création d'une liste

        List<Club> clubs = new ArrayList<Club>();

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");


            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            //query sql qui recupere les infos de la table clubs

            ResultSet resultat = state.executeQuery("SELECT * FROM clubs");

            while (resultat.next()) {

                //stockage des données sql dans des variables

                int id = resultat.getInt("PK_Club");
                String nom = resultat.getString("C_Nom");
                String type = resultat.getString("C_Type");



                //création d'un nouveau club

                Club cluby = new Club(id,nom,type);

                //add club dans la liste

                clubs.add(cluby);




            }

        } catch (Exception e) {
            e.printStackTrace();

        }


        return clubs;
    }



}

