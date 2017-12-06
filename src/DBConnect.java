import java.sql.Connection;
import java.sql.DriverManager;

//Permet de se conecter a la BDD Sql en gérant le mdp de chaqu'un.
// ex : PW Jaques = '' et PW Cedric = 'root'

public class DBConnect {
    public static void getConnection() {

        String url = "jdbc:mysql://localhost/exam_poo?useSSL=false";
        String user = "root";
        String passwd = "root";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver O.K.");

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}

