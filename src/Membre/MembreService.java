package Membre;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MembreService {

    public void createMembre(String nom, String prenom, String dateNaissance) {

        try {
            //Chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            state.executeQuery("INSERT INTO membres(M_Nom, M_Prenom, M_DateNaiss) VALUES('" + nom + "','" + prenom + "','" + dateNaissance +"')");


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
