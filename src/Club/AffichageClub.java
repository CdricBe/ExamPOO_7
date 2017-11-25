package Club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AffichageClub {






    public List<Club> recupereClub() {

        List<Club> clubs = new ArrayList<Club>();

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            ResultSet resultat = state.executeQuery("SELECT C_Nom, C_Type FROM clubs");

            while (resultat.next()) {

                String nom = resultat.getString("C_Nom");
                String type = resultat.getString("C_Type");


                clubs.add(new Club(nom, type));


            }

        } catch (Exception e) {
            e.printStackTrace();

        }


        return clubs;
    }



    }

