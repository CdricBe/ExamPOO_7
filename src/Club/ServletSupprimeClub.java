package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletSupprimeClub",urlPatterns = {"/supprime"})
public class ServletSupprimeClub extends HttpServlet {

    //creation de la classe supprime d'un club

    private ClubServiceSup suppriClub = new ClubServiceSup();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //recup des variables

        String nom = request.getParameter("club");
        String type= request.getParameter("type");

        //appel de la fonction

        suppriClub.supprimeClub(nom,type);
        response.sendRedirect("/afficheClub");



    }
}
