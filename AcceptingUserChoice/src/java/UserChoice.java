/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JUMAI
 */
@WebServlet(urlPatterns = ("/Username"))
public class UserChoice extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
         PrintWriter out = response.getWriter();
            
           //String name = request.getParameter("username");
           String first_name = request.getParameter("firstname");
           String last_name = request.getParameter("lastname");
           String middle_name = request.getParameter("middlename");
           String address = request.getParameter("address");
           String age = request.getParameter("age");
           
           
           
           out.println("Hello " + "<br>" );
           out.println (" First Name: " +first_name + "<br>");
           out.println (" Last Name: " +last_name + "<br>");
           out.println (" Middle Name: " +middle_name + "<br>");
           out.println (" Address: " + address + "<br>");
           out.println ("Age: " + age + "years old" + "<br>");
           
           response.getWriter().write(" You have just selected color:" + request.getParameter("color"));
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

}
