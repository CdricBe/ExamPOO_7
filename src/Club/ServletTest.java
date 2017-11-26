package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletTest",urlPatterns = {"/afficheClub"})
public class ServletTest extends HttpServlet {

    private AffichageClub affiche = new AffichageClub();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            request.setAttribute("clubs", affiche.recupereClub());
            request.getRequestDispatcher("Interface/AffichageClub.jsp").forward(request,response);


    }
}
