package Club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ClubService {

    public void creationClub(String nom, String type) {

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            state.executeUpdate("INSERT INTO clubs(C_Nom,C_Type) VALUES('"+nom+"','"+type+"')");



        } catch (Exception e) {
            e.printStackTrace();

        }


    }



}

