package andrii.servlets;

import andrii.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BeerSelectServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {

        String beerColor = request.getParameter("color");

//        if (beerColor.equals("brown")) {
//            response.sendRedirect("CodeReturnServlet.do");
//            return;
//        }

        BeerExpert beerExpert = new BeerExpert();
        ArrayList<String> advices = beerExpert.getBrands(beerColor);

        request.setAttribute("styles", advices);
        RequestDispatcher view = request.getRequestDispatcher("JSP/result.jsp");
        view.forward(request, response);

//        response.setContentType("text/html");
//        final PrintWriter out = response.getWriter();
//        out.println("Beer Selection Advice<br>");
//
//        for (String item : advices) {
//            out.print("<br>try: " + item);
//        }

    }

}
