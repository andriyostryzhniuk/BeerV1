package andrii.servlets;

import org.apache.commons.io.IOUtils;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CodeReturnServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("image/jpg");

        InputStream inputStream = CodeReturnServlet.class.getResourceAsStream("/rango.jpg");

        OutputStream outputStream = response.getOutputStream();

        IOUtils.copy(inputStream, outputStream);

        inputStream.close();
        outputStream.flush();
        outputStream.close();

    }

}
