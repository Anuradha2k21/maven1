package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h1><i><center>Welcome to <big>NIBM!</big></center></i></h1>");
        out.print(""
                + "<ul>"
                + "<li>Software engineering</li>"
                + "<li>Network engineering</li>"
                + "</ul>"
                + "");
        
        out.print("<form></form>");
    }
    
}
