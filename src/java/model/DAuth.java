/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBCon;
import dto.DUDTO;
import java.sql.SQLException;
import java.sql.Statement;

public class DAuth 
{    
     public boolean isData(DUDTO user){
        
        String patname = user.getPatName();
        String patage = user.getPatAge();
        String vacciname = user.getVacciName();
        String vaccidate = user.getVacciDate();
        String vacciloca = user.getVacciLocation();
        
         System.out.println("DCheck");
         System.out.println(patname);
         System.out.println(patage);
         System.out.println(vacciname);
         System.out.println(vaccidate);
         System.out.println(vacciloca);
        
        int i=0;
        if(patname!=null && vacciname!=null && patage!=null && vaccidate!=null && vacciloca!=null)
        {
            try{

                Statement st=DBCon.getStatement();
                String query2 = "INSERT INTO `data`(`PatName`,`PatAge`,`VacciName`,`VacciDate`,`VacciLocation`) VALUES ( '"+patname+"','"+patage+"','"+vacciname+"','"+vaccidate+"','"+vacciloca+"');";

                System.out.println("Query = "+query2);
                i = st.executeUpdate(query2);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
            if(i>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
     }
}
