package Membre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MembreServiceDelete {

        public void deleteMembre(String nomMembre, String prenomMembre) {

            try {
                //chargement du driver
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
                String login = "root";
                String passwd = "";

                Connection conn = DriverManager.getConnection(url, login, passwd);
                Statement state = conn.createStatement();

                //query sql qui supprime les membres
                state.executeUpdate("DELETE FROM membres WHERE M_Nom='"+nomMembre+"' AND M_Prenom='"+prenomMembre+"'");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
