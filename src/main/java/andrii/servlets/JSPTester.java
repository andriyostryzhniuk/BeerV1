package andrii.servlets;

import andrii.model.Dog;
import andrii.model.Employee;
import andrii.model.Person;
import andrii.model.Pet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JSPTester extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Dog dog = new Dog();
        dog.setName("Fingal");
        req.setAttribute("nullDog", dog);

        Person person = new Employee();
        person.setName("Andrii");
        person.setDog(dog);
        req.setAttribute("person", person);

        RequestDispatcher view = req.getRequestDispatcher("JSP/firstJSPTest.jsp");
        view.forward(req, resp);
    }
}
