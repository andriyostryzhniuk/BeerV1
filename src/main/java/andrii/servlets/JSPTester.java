package andrii.servlets;

import andrii.model.Dog;
import andrii.model.Employee;
import andrii.model.Person;
import andrii.model.Pet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

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

        ArrayList myList = new ArrayList(Arrays.asList(1, 2, 3));
        req.setAttribute("myList", myList);

        Map musicMap = new HashMap();
        musicMap.put("Ambient", "Zero 7");
        musicMap.put("Surf", "Tahiti 80");
        musicMap.put("DJ", "BT");
        musicMap.put("Indie", "Frou Frou");
        req.setAttribute("musicMap", musicMap);
        req.setAttribute("Genere", "Ambient");

        if (req.getParameter("name2") != null) {
            String userName = req.getParameter("name2").toString();
            boolean isUserNamesCookie = false;
            for (Cookie reqCookie : req.getCookies()) {
                if (reqCookie.getName().equals("userName")) {
                    reqCookie.setValue(userName);
                    break;
                }
            }
            if (!isUserNamesCookie) {
                Cookie cookie = new Cookie("userName", userName);
                resp.addCookie(cookie);
            }
        }

        RequestDispatcher view = req.getRequestDispatcher("JSP/firstJSPTest.jsp");
        view.forward(req, resp);
    }
}
