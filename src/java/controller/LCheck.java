/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.LUDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LAuth;

/**
 *
 * @author adiso
 */
public class LCheck extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {          
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        LUDTO user = new LUDTO();
        user.setUsername(username);
        user.setPassword(password);
        
        LAuth la = new LAuth();
        boolean login = la.isLogin(user);
        
        if(login)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            response.sendRedirect("data_table.jsp");
        }
        else
        {
            response.sendRedirect("login.html");
        }
    }
}