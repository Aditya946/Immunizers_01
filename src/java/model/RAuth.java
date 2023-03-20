/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBCon;
import dto.RUDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RAuth {
    
     public boolean isRegis(RUDTO user){
        
        String username = user.getUsername();
        String password = user.getPassword();
        String contact = user.getContact();
        String adhar = user.getAdhar();
        String dob=user.getDob();
        
//        System.out.println("RCheck");
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(contact);
//        System.out.println(dob);
        
        int i=0;
        if(username!=null && password!=null && contact!=null && adhar!=null && dob!=null)
        {
            try{

                Statement st=DBCon.getStatement();
                String query1 = "INSERT INTO `login`(`patName`,`patPassword`,`patContact`,`patAdhar`,`patDOb`) VALUES ( '"+username+"','"+password+"','"+contact+"','"+adhar+"','"+dob+"');";

                System.out.println("Query = "+query1);
                i = st.executeUpdate(query1);
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
