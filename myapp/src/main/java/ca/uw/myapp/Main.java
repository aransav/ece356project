/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.uw.myapp;

import ca.uw.myapp.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author siva
 */
public class Main {
    
    public static void main (String[] args){
        
        System.out.println("hello");
        
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.close();
        
        System.out.println("done");        
    }
    
   
}
