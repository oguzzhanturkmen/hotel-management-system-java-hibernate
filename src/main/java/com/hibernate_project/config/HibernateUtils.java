package com.hibernate_project.config;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate_project.domain.*;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

   static{
       try{
           Configuration configuration = new Configuration().
                   configure("hibernate.cfg.xml").
                   addAnnotatedClass(Hotel.class).
                   addAnnotatedClass(Room.class).
                   addAnnotatedClass(Guest.class).
                   addAnnotatedClass(Reservation.class);

           sessionFactory = configuration.buildSessionFactory();


       }catch (Exception e){
           System.out.println("Exception occured while creating session factory");
       }
   }

   public static SessionFactory getSessionFactory(){
       return sessionFactory;
   }

   public static void shutdown(){
       getSessionFactory().close();
   }

   public static void closeSession(Session session){
       if (session != null && session.isOpen())
           session.close();
   }

}
