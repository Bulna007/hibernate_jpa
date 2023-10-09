package com.bs3.test;

import com.bs3.entities.Account;
import com.bs3.helper.ProgSFRegistry;
import com.bs3.helper.PropsSFRegistry;
import com.bs3.helper.XmlSFRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BS3Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Account account = null;

        try{
            //sessionFactory = PropsSFRegistry.getSessionFactory();

            //sessionFactory = XmlSFRegistry.getSessionFactory();
            
            sessionFactory = ProgSFRegistry.getSessionFactory();
            session = sessionFactory.openSession();

            account = session.get(Account.class, 1);

            System.out.println(account);
        }finally {
            if(session != null)
                session.close();
            //PropsSFRegistry.closeSessionFactory();
            //XmlSFRegistry.closeSessionFactory();
            ProgSFRegistry.closeSessionFactory();
        }
    }
}
