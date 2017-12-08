package Membre;

import Club.AffichageClub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletAfficheMembre",urlPatterns = {"/AfficheMembre"})
public class ServletAfficheMembre extends HttpServlet {

    private AffichageMembre afficheTous = new AffichageMembre();

    private AffichageClub afficheClub = new AffichageClub();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getSession().setAttribute("clubs",afficheClub.recupereClub());

       request.setAttribute("membres", afficheTous.recupereMembre());
       request.getRequestDispatcher("Interface/AffichageMembre.jsp").forward(request,response);
    }
}
