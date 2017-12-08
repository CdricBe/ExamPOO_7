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

            //query sql qui selectionne les champs de la table membres dans la bd
            ResultSet resultat = state.executeQuery("SELECT M_Nom,M_Prenom,M_DateNaiss,C_Nom FROM membres INNER JOIN clubs on FK_Club=PK_Club ORDER  by C_Nom ");

            while (resultat.next()) {

                //recup et stockage des variables

                String nomMembre = resultat.getString("M_Nom");
                String prenomMembre = resultat.getString("M_Prenom");
                String dateMembre = resultat.getString("M_DateNaiss");
                String clubMembre = resultat.getString("C_Nom");

                //on stocke les données dans l'arraylist

                Membre Michel = new Membre(nomMembre,prenomMembre,dateMembre,clubMembre);
                membres.add(Michel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return membres;
    }


}
