/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import static Printers.StringConstants.INPSUB5; //MERK
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hallgeir
 */
@WebServlet(name = "HttpServletProject", urlPatterns = {"/HttpServletProject"})
public class HttpServletProject extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }
    
    public void printMenuButtons(PrintWriter out) 
    {
        out.println("<form>");
        out.format(INPSUB5, "Submit", "index.html", "Index Page");
        out.format(INPSUB5, "Submit", "Menu", "Home");
        out.format(INPSUB5, "Submit", "NewStudent", "New Student");
        out.format(INPSUB5, "Submit", "retrieveStudents.html", "List Students");
        out.println("</form>");     
               
    }
    
     public void skrivHtmlHeader(PrintWriter out,  String tittel)
 {
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>" +tittel +"</title>");  
       //out.println("<meta charset=\"UTF-8\">");    
       out.println("<link rel=\"stylesheet\" href=\"css.css\">");            
       out.println("</head>");
 }
     
     public void printBody(PrintWriter out,HttpServletRequest request)
     {
         out.println("<body>");       
         printMenuButtons(out); 
     }
     
     public void printEnd(PrintWriter out)
     {
            out.println("</body>");
            out.println("</html>");
     }
     
     
     public void printPage(PrintWriter out,HttpServletRequest request, String tittel) 
     {
         skrivHtmlHeader(out, tittel);
         printBody(out, request);
         printEnd(out);
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
