/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.octMonservlet;

import com.octect.beans.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author fssy
 */
@WebServlet(name = "Monservlet", urlPatterns = {"/Monservlet"})
public class Monservlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
                    System.out.println(" àààààààààààààààààààààààje suis dans doGet()");

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Monservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Monservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("nom");
        String fullname = request.getParameter("prenom");
        request.setAttribute("nom", name);
        request.setAttribute("nom", fullname);
        System.out.println(" je suis dans doGet()");
        this.getServletContext().getRequestDispatcher("/WEB-INF/Inscrire.jsp").forward(request, response);
//                 this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);

        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String email = request.getParameter("email");
        String passe1 = request.getParameter("passe1");
        String passe2 = request.getParameter("passe2");
        String erreurs = "";
        
        if(
                !"".equals(nom) && !"".equals(prenom) && 
                !"".equals(pseudo) && !"".equals(email) &&
                !"".equals(passe1) && !"".equals(passe2)
           )
            
        {
           if(passe1.equals(passe2))
           {
                  
               HttpSession session = request.getSession();
               
               List<User> myArrayList = (List)session.getAttribute("liste");
               if(myArrayList == null) {
                   
                   myArrayList=new ArrayList<User>();
               }
               User user = new User(nom, prenom, pseudo, email, passe2);
               
               myArrayList.add(user);
//                            
                 request.setAttribute("nom", nom);
                 request.setAttribute("prenom", prenom);
               session.setAttribute("liste", myArrayList);
               request.getRequestDispatcher("WEB-INF/Accueil.jsp").forward(request, response);
           }
           else
           {
                erreurs = "Les mots de passe ne correspondent pas ";
                request.setAttribute("erreurs", erreurs);
               request.getRequestDispatcher("WEB-INF/Inscrire.jsp").forward(request, response);
           }
            
            }
        
        else
        {
            erreurs = "Veuillez remplir tous les champs";
           request.setAttribute("erreurs", erreurs);
           request.getRequestDispatcher("WEB-INF/Inscrire.jsp").forward(request, response);     
        }
    }
        


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
