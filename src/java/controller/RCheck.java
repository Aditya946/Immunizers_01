/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.RUDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RAuth;

/**
 *
 * @author adiso
 */
public class RCheck extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {          
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String contact = request.getParameter("contact");
        String adhar = request.getParameter("adhar");
        String dob = request.getParameter("dob");
 
        
        RUDTO user = new RUDTO();
        user.setUsername(username);
        user.setPassword(password);
        user.setContact(contact);
        user.setAdhar(adhar);
        user.setDob(dob);
       
        
        RAuth la = new RAuth();
        boolean regis = la.isRegis(user);
        
        if(regis)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            session.setAttribute("contact",contact);
            session.setAttribute("adhar", adhar);
            session.setAttribute("dob",dob);
           
            
            response.sendRedirect("login.html");
        }
        else
        {
            response.sendRedirect("login.html");
        }
    } 
}
