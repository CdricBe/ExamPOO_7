package Membre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AffichageMembre {

    public List<Membre> recupereMembre() {

        List<Membre> membres = new ArrayList<Membre>();

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            ResultSet resultat = state.executeQuery("SELECT * FROM membres");



            while (resultat.next()) {

                String prenom = resultat.getString("M_Prenom");
                String nom = resultat.getString("M_Nom");
                String dateNaiss = resultat.getString("M_DateNaiss");
                String clubMembre = resultat.getString("FK_Club");



                Membre Michel = new Membre(prenom,nom,dateNaiss,clubMembre);

                membres.add(Michel);


            }

        } catch (Exception e) {
            e.printStackTrace();

        }


        return membres;
    }


}
