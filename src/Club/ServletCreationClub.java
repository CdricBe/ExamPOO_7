package Club;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "ServletCreationClub",urlPatterns = {"/club"})
public class ServletCreationClub extends javax.servlet.http.HttpServlet {

    private ClubService creaClub = new ClubService();


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String nomClub = request.getParameter("nomClub");
        String typeClub = request.getParameter("typeClub");

        creaClub.creationClub(nomClub,typeClub);
        request.getRequestDispatcher("/Interface/Accueil.jsp").forward(request,response);


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.getRequestDispatcher("Interface/CreationClub.jsp").forward(request,response);

    }
}
