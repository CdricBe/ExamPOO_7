package Membre;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "ServletNewMembre",urlPatterns = {"/membre"})
public class ServletNewMembre extends javax.servlet.http.HttpServlet {

    private MembreService newMemb = new MembreService();


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String nomMembre = request.getParameter("nomMembre");
        String prenomMembre = request.getParameter("prenomMembre");
        String DateNaiss = request.getParameter(  "DateNaiss");

        newMemb.createMembre(nomMembre,prenomMembre, DateNaiss);
        request.getRequestDispatcher("/Interface/Accueil.jsp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.getRequestDispatcher("Interface/NewMembre.jsp").forward(request,response);

    }
}