/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBCon;
import dto.LUDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author adiso
 */
public class LAuth 
{
    public boolean isLogin(LUDTO user)
    {
        String username = user.getUsername();
        String password = user.getPassword();
        String tablePassword="";
        try
        {
            Statement st = DBCon.getStatement();
            String query = "SELECT patPassword FROM login WHERE patName ='"+username+"'";
            System.out.println("Query  = "+query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                tablePassword = rs.getString(1);
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablePassword))
        {
            return true;
        }
        return false;
    }
}

