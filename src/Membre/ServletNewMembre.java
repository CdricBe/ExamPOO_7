package Membre;

import Club.AffichageClub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletNewMembre",urlPatterns = {"/creamembre"})
public class ServletNewMembre extends HttpServlet {

    //creation de la classe créer un membre

    private MembreService creaMembre = new MembreService();

    //creation de la classe affichage d'un club

    private AffichageClub affiche = new AffichageClub();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //recup et stockage des variables

        String nomMembre = request.getParameter("nomMembre");
        String prenomMembre = request.getParameter("prenomMembre");
        String DateNaiss = request.getParameter("DateNaiss");
        String club = request.getParameter("club");

        //conditions pour savoir si le champ est vide

        if (nomMembre.isEmpty() || prenomMembre.isEmpty()) {

            request.setAttribute("errorMessage", "veuillez entrer un nom/prenom ");
            request.getRequestDispatcher("/Interface/NewMembre.jsp").forward(request, response);

        } else {

            creaMembre.createMembre(nomMembre, prenomMembre, DateNaiss, club);
            response.sendRedirect("AfficheMembre");

        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().setAttribute("clubs",affiche.recupereClub());

        request.getRequestDispatcher("Interface/NewMembre.jsp").forward(request,response);

    }
}