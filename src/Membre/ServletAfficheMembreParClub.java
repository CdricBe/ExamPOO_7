package Membre;

import Club.AffichageClub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletAfficheMembreParClub",urlPatterns = {"/AfficheMembreClub"})
public class ServletAfficheMembreParClub extends HttpServlet {

    private AffichageMembreParClub affiche = new AffichageMembreParClub();

    private AffichageClub afficheClub = new AffichageClub();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // recup de la variable dans le form pour afficher membres par club

        String nom = request.getParameter("club");
        request.setAttribute("membres",affiche.recupereMembreClub(nom));

        request.getRequestDispatcher("Interface/AfficheMembreParClub.jsp").forward(request,response);
    }
}
