package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModifierClub",urlPatterns = {"/modifier"})
public class ServletModifierClub extends HttpServlet {

    //creation de la classe modification d'un club

    private ModifierClub modifie= new ModifierClub();

    //creation de la classe affichage d'un club

    private AffichageClub affiche = new AffichageClub();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //recup des variables

        String nom=request.getParameter("cluby");
        String Newnom=request.getParameter("NewClub");
        String Newtype=request.getParameter("NewType");


        //appel de la fonction et revient vers l'affichage des clubs

        modifie.modifierClub(nom,Newnom,Newtype);
        response.sendRedirect("/afficheClub");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //recupere les clubs pour un affichage liste déroulante ds la jsp

        request.setAttribute("clubs", affiche.recupereClub());

        request.getRequestDispatcher("Interface/ModifierClub.jsp").forward(request,response);

    }
}
