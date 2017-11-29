package Membre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletAfficheMembre",urlPatterns = {"/AfficheMembre"})
public class ServletAfficheMembre extends HttpServlet {
    private AffichageMembre afficheMBR = new AffichageMembre();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setAttribute("membres", afficheMBR.recupereMembre());
        request.getRequestDispatcher("Interface/AffichageMembre.jsp").forward(request,response);

    }
}
