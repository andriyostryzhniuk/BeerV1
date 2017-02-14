package andrii.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServletContext extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        RequestDispatcher view = request.getRequestDispatcher("JSP/testServletContext.jsp");
        view.forward(request, response);
    }

}
