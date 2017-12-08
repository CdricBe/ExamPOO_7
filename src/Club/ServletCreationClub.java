package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletCreationClub",urlPatterns = {"/creaclub"})
public class ServletCreationClub extends HttpServlet {

    //creation de la classe creation d'un club

    private ClubService creaclub =new ClubService();

    //creation de la classe affichage d'un club

    private AffichageType affiche = new AffichageType();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        //recup des variables

        String nomClub = request.getParameter("nomClub");
        String typeClub = request.getParameter("typeClub");



        // création d'un club

        if(!nomClub.isEmpty()){

            creaclub.creationClub(nomClub,typeClub);

            response.sendRedirect("/afficheClub");


        }
        else{

            request.setAttribute("errorMessage", "veuillez entrer un nom de club");
            request.getRequestDispatcher("Interface/CreationClub.jsp").forward(request, response);


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().setAttribute("types",affiche.recupereTypeClub());

        request.getRequestDispatcher("Interface/CreationClub.jsp").forward(request,response);

    }
}
