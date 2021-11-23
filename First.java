import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

public class First extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
    {
        response.getWriter().println("Hello World!!");
    }
}