package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletSupprimeClub",urlPatterns = {"/supprime"})
public class ServletSupprimeClub extends HttpServlet {

    private ClubServiceSup suppriClub = new ClubServiceSup();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomClub = request.getParameter("ClubSupprime");


        suppriClub.supprimeClub(nomClub);
        response.sendRedirect("/Interface/AffichageClub.jsp");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("Interface/SupprimeClub.jsp").forward(request,response);

    }
}
