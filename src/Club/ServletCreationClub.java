package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCreationClub",urlPatterns = {"/creaclub"})
public class ServletCreationClub extends HttpServlet {

    private ClubService creaclub =new ClubService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String nomClub = request.getParameter("nomClub");
        String typeClub = request.getParameter("typeClub");

        creaclub.creationClub(nomClub,typeClub);
        response.sendRedirect("/afficheClub");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("Interface/CreationClub.jsp").forward(request,response);

    }
}
