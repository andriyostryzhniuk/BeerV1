package andrii.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

public class TestInitParams extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        HashMap<String, String> emails = new HashMap();

        Enumeration enumeration = getServletConfig().getInitParameterNames();
        String paramName;
        while (enumeration.hasMoreElements()) {
            paramName = (String) enumeration.nextElement();
            emails.put(paramName, getServletConfig().getInitParameter(paramName));
        }

        request.setAttribute("emails", emails);
        RequestDispatcher view = request.getRequestDispatcher("JSP/emailView.jsp");
        view.forward(request, response);

    }
}
