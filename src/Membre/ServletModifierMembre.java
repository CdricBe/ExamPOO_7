package Membre;

import Club.AffichageClub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModifierMembre",urlPatterns = {"/modifMembre"})
public class ServletModifierMembre extends HttpServlet {

    private MofidierMembre modifMembre = new MofidierMembre();

    private AffichageClub afficheClub = new AffichageClub();

    private AffichageMembre afficheMembre = new AffichageMembre();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter("membreamodif");
        String NewNom= request.getParameter("NewNMembre");
        String NewPrenom=request.getParameter("NewPMembre");
        String NewClub= request.getParameter("NewClub");


        modifMembre.modifierMembre(nom,NewNom,NewPrenom,NewClub);
        response.sendRedirect("/AfficheMembre");





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("membres",afficheMembre.recupereMembre());

        request.setAttribute("clubs",afficheClub.recupereClub());

        request.getRequestDispatcher("Interface/ModifierMembre.jsp").forward(request,response);


    }
}
