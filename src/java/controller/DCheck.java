/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.DUDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAuth;

/**
 *
 * @author adiso
 */
public class DCheck extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {          
        String patname = request.getParameter("patname");
        String patage = request.getParameter("patage");
        String vaccidate = request.getParameter("vaccidate");
        String vacciname = request.getParameter("vacciname");
        String vacciloca = request.getParameter("vaccilocation");
        
        DUDTO user = new DUDTO();
        user.setPatAge(patage);
        user.setPatName(patname);
        user.setVacciDate(vaccidate);
        user.setVacciName(vacciname);
        user.setVacciLocation(vacciloca);
        
        DAuth la = new DAuth();
        boolean data = la.isData(user);
        
        if(data)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("patname",patname);
            session.setAttribute("patage",patage);
            session.setAttribute("vaccidate",vaccidate);
            session.setAttribute("vacciname",vacciname);
            session.setAttribute("vacciloca",vacciloca);
           
            
            response.sendRedirect("success.jsp");
        }
        else
        {
            response.sendRedirect("success.jsp");
        }
    } 
}
