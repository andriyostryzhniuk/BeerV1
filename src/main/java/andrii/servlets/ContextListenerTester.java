package andrii.servlets;

import andrii.model.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContextListenerTester extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("test context attributes set by listener<br>");

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("Dog's breed is: " + dog.getBreed());
    }
}
