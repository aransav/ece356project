/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ca.uw.myapp.Object.User;

/**
 *
 * @author Aran
 */
public class serv_signup extends HttpServlet {

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
        try {
            String fname = request.getParameter("fname");
            String mname = request.getParameter("mname");
            String lname = request.getParameter("lname");
            boolean male = request.getParameter("male") != null;  
            boolean female = request.getParameter("female") != null;  
            String hcard = request.getParameter("hcard");
            String scard = request.getParameter("scard");
            String add_streetno = request.getParameter("add_streetno");
            String add_street = request.getParameter("add_street");
            String add_aptno = request.getParameter("add_aptno");
            String add_city = request.getParameter("add_city");
            String add_prov = request.getParameter("add_prov");
            String add_zip = request.getParameter("add_zip");
            String phone_no_home = request.getParameter("phone_no_home");
            String phone_no_cell = request.getParameter("phone_no_cell");
            String phone_no_work = request.getParameter("phone_no_work");
            String dob = request.getParameter("dob");
            String password1 = request.getParameter("password1");
            String password2 = request.getParameter("password2");
            if (!password1.equals(password2))
            {
                request.setAttribute("errorMessage", "Passwords were not the same.");
                request.getRequestDispatcher("signupPage.jsp").forward(request,response); 
            }
            if (male == female)
            {
                request.setAttribute("errorMessage", "Cannot check both/neither Male and Female boxes");
                request.getRequestDispatcher("signupPage.jsp").forward(request,response); 
            }
        }
        catch(Throwable exc)
        {
            System.out.println(exc);
        }
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
