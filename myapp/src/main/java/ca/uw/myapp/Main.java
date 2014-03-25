/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.uw.myapp;

import ca.uw.myapp.Object.Address;
import ca.uw.myapp.Object.User;
import ca.uw.myapp.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author siva
 */
public class Main {
    
    public static void main (String[] args){
        
        System.out.println("hello");
        
        User u = new User();
        Address a = new Address();
        a.setCity("TO");
        
        u.setAddress(a);
        u.setUsername("ABC");
        u.setFirstname("BCD");
        u.setLastname("CDE");
        
        
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(u);
        tx.commit();
        session.close();
        
        System.out.println("done");        
    }
    
   
}
