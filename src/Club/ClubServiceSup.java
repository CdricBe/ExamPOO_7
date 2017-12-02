package Club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ClubServiceSup {

    public void supprimeClub(String nom, String type) {

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            //query sql qui supprime les infos nom et type de la table clubs

            state.executeUpdate("DELETE FROM clubs WHERE C_Nom='"+nom+"' AND C_Type='"+type+"'");


        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
