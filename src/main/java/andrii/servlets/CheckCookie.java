package andrii.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckCookie extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<Cookie> cookies = new ArrayList<>(Arrays.asList(req.getCookies()));

        if (!cookies.isEmpty()) {
            cookies.forEach(cookie -> {
               if (cookie.getName().equals("username")) {
                   String name = cookie.getValue();
                   return;
               }
            });
        }
    }
}
