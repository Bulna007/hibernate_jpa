package com.msf.test;

import com.msf.dao.LoanEnquireDao;
import com.msf.entities.LoanEnquire;
import com.msf.helper.SessionFactoryRegistry;

import java.util.Scanner;

public class MSFTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanEnquireDao loanEnquireDao = null;
        LoanEnquire loanEnquire = null;

        try{
            loanEnquireDao = new LoanEnquireDao();
            System.out.print("Enter Loan Enquire No : ");
            int loanEnquireNo = sc.nextInt();
            System.out.println();
            loanEnquire = loanEnquireDao.findLoanEnquire(loanEnquireNo);
        }finally {
            SessionFactoryRegistry.closeSessionFactory();
        }
    }
}
