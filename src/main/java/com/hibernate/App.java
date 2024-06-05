package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Projec is Started" );
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        // Now we have the factory object . we need to carried out the session from here
        
        Session session = factory.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        Student st = new Student();
        st.setId(1001);
        st.setName("Anurag");
        session.persist(st);
        tx.commit();
        session.close();

    }
}
