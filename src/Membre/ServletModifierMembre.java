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

    //création des différentes classes

    private MofidierMembre modifMembre = new MofidierMembre();

    private AffichageClub afficheClub = new AffichageClub();

    private AffichageMembre afficheMembre = new AffichageMembre();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //stockage des variables

        String nom = request.getParameter("membreamodif");
        String NewNom= request.getParameter("NewNMembre");
        String NewPrenom=request.getParameter("NewPMembre");
        String NewClub= request.getParameter("NewClub");

        //conditions si le champ est null ou pas

        if (NewNom.isEmpty() || NewPrenom.isEmpty()) {

            request.setAttribute("errorMessage", "veuillez entrer un nom/prenom ");
            request.getRequestDispatcher("/Interface/ModifierMembre.jsp").forward(request, response);

        } else {

            modifMembre.modifierMembre(nom,NewNom,NewPrenom,NewClub);
            response.sendRedirect("/AfficheMembre");



        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().setAttribute("membres",afficheMembre.recupereMembre());

        request.getSession().setAttribute("clubs",afficheClub.recupereClub());

        request.getRequestDispatcher("Interface/ModifierMembre.jsp").forward(request,response);


    }
}
