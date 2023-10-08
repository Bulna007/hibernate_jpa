package com.msf.dao;

import com.msf.entities.LoanEnquire;
import com.msf.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LoanEnquireDao {
    public LoanEnquire findLoanEnquire(int loanEnquireNo){
        SessionFactory sessionFactory = null;
        Session session = null;
        LoanEnquire loanEnquire = null;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();

            loanEnquire = session.get(LoanEnquire.class, loanEnquireNo);

        }finally {
            if(session != null) {
                session.close();
            }
        }
        return loanEnquire;
    }
}
