package com.hibernate_project.repository;

import com.hibernate_project.config.HibernateUtils;
import com.hibernate_project.domain.Hotel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HotelRepository {

    Session session;

    public void save(Hotel hotel) {
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(hotel);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Exception occured while saving hotel");
        } finally {
            HibernateUtils.closeSession(session);
        }
        }
}
