import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContactServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Thank You, " + name + "!</h2>");
        out.println("<p>Your message has been received:</p>");
        out.println("<p>" + message + "</p>");
    }
}
