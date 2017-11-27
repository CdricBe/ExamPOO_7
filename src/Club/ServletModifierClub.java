package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModifierClub",urlPatterns = {"/modifier"})
public class ServletModifierClub extends HttpServlet {

    private ModifierClub modifie= new ModifierClub();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom=request.getParameter("ClubModifier");
        String Newnom=request.getParameter("NewClub");
        String Newtype=request.getParameter("NewType");


        modifie.modifierClub(nom,Newnom,Newtype);
        response.sendRedirect("/afficheClub");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("Interface/ModifierClub.jsp").forward(request,response);

    }
}
