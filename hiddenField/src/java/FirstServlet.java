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
@WebServlet(urlPatterns = {"/FirstServlet"})  
public class FirstServlet extends HttpServlet {

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
        
        try{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            String n=request.getParameter("username");
            out.print("Welcome " +n);
            
            out.println("<form action= 'SecondServlet'>");
            out.println("<input type='hidden' name='uname' value='"+n+" '>");
            out.println("<input type='submit' value='submit'>");
            out.println("</form>");
            out.close();
            
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }

    
}
