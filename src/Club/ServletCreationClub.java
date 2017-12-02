package Club;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCreationClub",urlPatterns = {"/creaclub"})
public class ServletCreationClub extends HttpServlet {

    //creation de la classe creation d'un club

    private ClubService creaclub =new ClubService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        //recup des variables

        String nomClub = request.getParameter("nomClub");
        String typeClub = request.getParameter("typeClub");

        //test pour la création d'un club

        boolean Conforme = creaclub.creationClub(nomClub,typeClub);

        if(Conforme){

            response.sendRedirect("/afficheClub");
        }
        else{

            //msg d'erreur si nom club deja dans la bd

            request.setAttribute("errorMessage","Choisir un autre nom");
            request.getRequestDispatcher("/Interface/CreationClub.jsp").forward(request,response);

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("Interface/CreationClub.jsp").forward(request,response);

    }
}
