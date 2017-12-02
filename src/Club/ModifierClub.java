package Club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModifierClub {

    public void modifierClub(String nom, String NewNom, String NewType) {

        try {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
            String login = "root";
            String passwd = "";

            Connection conn = DriverManager.getConnection(url, login, passwd);

            Statement state = conn.createStatement();

            //query sql qui update les infos nom et type de la table clubs

            state.executeUpdate("UPDATE clubs SET C_Nom='"+NewNom+"', C_Type='"+NewType+"' WHERE PK_Club = '"+nom+"'");


        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}



