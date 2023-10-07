package com.bo.test;

import com.bo.entities.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BOTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Account account = null;

        try {
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();

            account = session.get(Account.class,1);
            System.out.println(account);

        }finally {
            if (session != null){
                session.close();
            }
            sessionFactory.close();
        }

    }
}
