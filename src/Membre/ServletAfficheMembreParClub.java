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

    private AffichageMembreParClub afficheTousMC = new AffichageMembreParClub();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("membres", afficheTousMC.recupereMembreClub("nomDuClubRecherche"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Interface/AfficheMembreParClub.jsp").forward(request,response);
    }
}
