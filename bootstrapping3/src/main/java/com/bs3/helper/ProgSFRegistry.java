package com.bs3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgSFRegistry {
    private static SessionFactory sessionFactory;

    static{
        try{
            Configuration configuration = new Configuration();
            configuration.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
            configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hibdb");
            configuration.setProperty("hibernate.connection.username","root");
            configuration.setProperty("hibernate.connection.password","root");
            configuration.setProperty("hibernate.show_sql","true");
            configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
            configuration.addResource("com/bs3/entities/Account.hbm.xml");

            sessionFactory = configuration.buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void closeSessionFactory(){
        if(sessionFactory != null){
            sessionFactory.close();
            sessionFactory = null;
        }
    }
}
