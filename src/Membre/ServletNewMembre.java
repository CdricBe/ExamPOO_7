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

    private MembreService creaMembre = new MembreService();

    private AffichageClub affiche = new AffichageClub();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomMembre = request.getParameter("nomMembre");
        String prenomMembre = request.getParameter("prenomMembre");
        String DateNaiss = request.getParameter(  "DateNaiss");
        String club = request.getParameter("club");



        creaMembre.createMembre(nomMembre,prenomMembre, DateNaiss,club);
        response.sendRedirect("AfficheMembre");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("clubs",affiche.recupereClub());

        request.getRequestDispatcher("Interface/NewMembre.jsp").forward(request,response);

    }
}