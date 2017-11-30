package Membre;

import Club.ClubServiceSup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDeleteMembre",urlPatterns = {"/deleteMembre"})
public class ServletDeleteMembre extends HttpServlet {

    private MembreServiceDelete suppriMembre = new MembreServiceDelete();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomMembre = request.getParameter("delNomMembre");
        String prenomMembre = request.getParameter("delPrenomMembre");

        suppriMembre.deleteMembre(nomMembre,prenomMembre);
        response.sendRedirect("/AfficheMembre");
    }
}