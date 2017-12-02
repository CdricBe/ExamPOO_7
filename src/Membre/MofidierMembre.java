package Membre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MofidierMembre {

    public void modifierMembre(String nom, String NewNom, String NewPrenom, String NewClub) {

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);
            Statement state = conn.createStatement();

            state.executeUpdate("UPDATE membres SET M_Nom='"+NewNom+"', M_Prenom='"+NewPrenom+"', FK_Club='"+NewClub+"' WHERE M_Nom = '"+nom+"'");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
